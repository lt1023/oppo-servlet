package com.demo.serverlet;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.heytap.cdo.card.domain.dto.AppListCardDto;
import com.heytap.cdo.card.domain.dto.ViewLayerWrapDto;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/test-oppo")
public class HelloServlet extends HttpServlet {
    private String message;

    private final String TYPE_XX = "81";//休闲益智
    private final String TYPE_MUSIC = "8148";//音乐舞蹈
    private final String TYPE_ROLE_PLAY = "85";//角色扮演
    private final String TYPE_ACTION = "469";//动作冒险
    private final String TYPE_SPORT = "84";//体育竞速
    private final String TYPE_CATEGORY = "8143";//经营策略
    private final String TYPE_POKER = "82";//棋牌
    private final String TYPE_SHOT = "8137";//射击游戏
    private final String TYPE_OTHER = "8126";//特色分类

    public void init() {
        message = "Hello World!!!!";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        System.out.println("hello doGet");
        response.setContentType("text/html");

//        try {
////            String sign = Oppo.getSign("0", "10", "1721787899438", "81");
//
//            System.out.println(System.currentTimeMillis());
////            String sign = Oppo.getSg("0", "10", "1721789378790", "81");
//            String sign = Oppo.getSg("0", "10", "1721787899438", "81");
//            if (sign != null){
//                System.out.println(sign);
//                return;
//            }
//        } catch (NoSuchAlgorithmException e) {
////            throw new RuntimeException(e);
//        }

        try {
            String queryString = request.getQueryString();
//            System.out.println("queryString=" + queryString);
            if (queryString != null) {
                if (queryString.contains("&")) {
                    String[] split = queryString.split("&");
                    String type = null;
                    String size = null;
                    for (String query : split) {
                        if (query.contains("type=")) {
                            type = query.split("type=")[1];
                        }
                        if (query.contains("size=")) {
                            size = query.split("size=")[1];
                        }
                    }
                    System.out.println("type=" + type);
                    System.out.println("size=" + size);
                    if (type != null && size != null) {
                        startQuery(response, type, size);
                        return;
                    }
                }
            }
        } catch (Throwable t) {

        }
        response.getWriter().println("error");
//        out.println(new Gson().toJson(gameBeanList));
    }

    private static void startQuery(HttpServletResponse response, String type, String size) throws IOException {
        List<GameBean> gameBeanList = new ArrayList<>();

        InputStream gmeList = Oppo.getTopGmeListInputStream(type.strip(), size.strip());
        assert gmeList != null;

        AppListCardDtoP.ViewLayerWrapDto parsedFrom = AppListCardDtoP.ViewLayerWrapDto.parseFrom(gmeList);

        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1> getIsEnd=" + parsedFrom.getIsEnd() + "</h1>");

        List<AppListCardDtoP.CardDto> cardsList = parsedFrom.getCardsList();
        System.out.println("cardsList="+cardsList.size());
        for (AppListCardDtoP.CardDto cardDto : cardsList) {

            List<AppListCardDtoP.ResourceDto> appsList = cardDto.getAppsList();
            for (AppListCardDtoP.ResourceDto app : appsList) {
                GameBean bean = new GameBean();
                bean.setDevName("");
                bean.setUpdateTime("");
                bean.setGameName(app.getAppName());
                bean.setIcon(app.getIconUrl());
                bean.setGrade(app.getGrade() + "");
                bean.setDownloadUrl(app.getUrl());
                bean.setSize(app.getSizeDesc());
                bean.setTag(app.getShortDesc());
                bean.setInstallTimes(app.getDlCount() + "");
                gameBeanList.add(bean);

            }
//            List<AppListCardDtoP.ResourceDto> multipleAppsList = cardDto.getMultipleAppsList();
//            System.out.println("multipleAppsList="+multipleAppsList.size());

//            for (AppListCardDtoP.ResourceDto appInheritDto: multipleAppsList){
//                try {
//                    bean.setDevName("");
//                    bean.setUpdateTime("");
//                    bean.setGameName(appInheritDto.getAppName());
//                    bean.setIcon(appInheritDto.getIconUrl());
//                    bean.setGrade(appInheritDto.getGrade() + "");
//                    bean.setDownloadUrl(appInheritDto.getUrl());
//                    bean.setSize(appInheritDto.getSizeDesc());
//                    bean.setTag(appInheritDto.getShortDesc());
//                    bean.setInstallTimes(appInheritDto.getDlCount() + "");
//                }catch (Throwable throwable){}
//
//            }

        }
//        out.println("</body></html>");
        out.println(new Gson().toJson(gameBeanList));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        System.out.println("hello doPost");
    }

    public void destroy() {
    }
}