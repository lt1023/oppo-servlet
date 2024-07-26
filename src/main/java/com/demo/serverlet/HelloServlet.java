package com.demo.serverlet;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;

@WebServlet(name = "helloServlet", value = "/test-oppo")
public class HelloServlet extends HttpServlet {
    private String message;

    //游戏
    private final String TYPE_XX = "81";//休闲益智
    private final String TYPE_MUSIC = "8148";//音乐舞蹈
    private final String TYPE_ROLE_PLAY = "85";//角色扮演
    private final String TYPE_ACTION = "469";//动作冒险
    private final String TYPE_SPORT = "84";//体育竞速
    private final String TYPE_CATEGORY = "8143";//经营策略
    private final String TYPE_POKER = "82";//棋牌
    private final String TYPE_SHOT = "8137";//射击游戏
    private final String TYPE_OTHER = "8126";//特色分类


    //排行榜

    private final String TYPE_RANK_TOP = "50004166";//热门榜
    private final String TYPE_RANK_NEW_GAME = "50004167";//新游榜
    private final String TYPE_RANK_SALE = "50004200";//畅销榜
    //    private final String TYPE_RANK_CATEGORY = "50004170";//经营策略
//    private final String TYPE_RANK_XX = "50004171";//休闲益智
//    private final String TYPE_RANK_SHOT = "50004172";//射击游戏
//    private final String TYPE_RANK_ACTION = "50004173";//动作冒险
    private final String TYPE_RANK_POKER = "50004174";//棋牌游戏
    //    private final String TYPE_RANK_ROLE = "50004175";//角色扮演
    private final String TYPE_RANK_BOOKING = "50004214";//预约榜


    private static Map<String, Long> cacheTimeMap = new HashMap<>();
    private static Map<String, List<GameBean>> cacheMap = new HashMap<>();
    private static final long REQUEST_TIME_DELAY = 10 * 60 * 1000;
//    private static final long REQUEST_TIME_DELAY = 30 * 1000;

//    private static final Logger logger = LogManager.getLogger(HelloServlet.class);

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
                    String page = null;
                    for (String query : split) {
                        if (query.contains("type=")) {
                            type = query.split("type=")[1];
                        }
                        if (query.contains("size=")) {
                            size = query.split("size=")[1];
                        }
                        if (query.contains("page=")) {
                            page = query.split("page=")[1];
                        }
                    }
//                    System.out.println("type=" + type);
//                    System.out.println("size=" + size);
                    if (type != null && size != null) {
                        if (Objects.equals(page, "0")) {
                            if (isCacheAvaliable(response, type)) return;
                            startQuery(response, type, size);
                        } else if (Objects.equals(page, "1")) {
                            if (isCacheAvaliable(response, type)) return;
                            startQueryRankList(response, type, size);
                        }
                        return;
                    }
                }
            }
        } catch (Throwable t) {

        }
        response.getWriter().println("error");
    }

    private static boolean isCacheAvaliable(HttpServletResponse response, String type) throws IOException {
        LocalDateTime now = LocalDateTime.now();
        if (cacheTimeMap.containsKey(type) && cacheMap.containsKey(type)) {
//            logger.info("time:"+now + ", isCacheAvaliable:" + type);
            System.out.println("time:"+now + ", isCacheAvaliable:" + type);
            long lastTime = cacheTimeMap.get(type);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - lastTime < REQUEST_TIME_DELAY) {
                List<GameBean> gameBeanList = cacheMap.get(type);
                response.getWriter().println(new Gson().toJson(gameBeanList));
                return true;
            }
        }
//        logger.info("time:"+now + ", isCacheNotAvaliable:" + type);
        System.out.println("time:"+now + ", isCacheNotAvaliable:" + type);
        return false;
    }


    private static void startQueryRankList(HttpServletResponse response, String type, String size) throws IOException {
        InputStream rankList = Oppo.getRankList(type.strip(), size.strip());
//        System.out.println(rankList);
        if (rankList == null) return;
        deseriliseData(type, response, rankList);
    }

    private static void deseriliseData(String type, HttpServletResponse response, InputStream rankList) throws IOException {
        AppListCardDtoP.ViewLayerWrapDto parsedFrom = AppListCardDtoP.ViewLayerWrapDto.parseFrom(rankList);
        PrintWriter out = response.getWriter();
        List<GameBean> gameBeanList = new ArrayList<>();
        List<AppListCardDtoP.CardDto> cardsList = parsedFrom.getCardsList();
//        System.out.println("cardsList=" + cardsList.size());
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
                bean.setAppId(app.getAppId());
                bean.setPkgName(app.getPkgName());
                bean.setVerCode(app.getVerCode());
                bean.setScreenshots(app.getScreenshotsList());
                bean.setVerName(app.getVerName());
                gameBeanList.add(bean);
            }
        }
        out.println(new Gson().toJson(gameBeanList));
        cacheMap.put(type, gameBeanList);
        cacheTimeMap.put(type, System.currentTimeMillis());
    }

    private static void startQuery(HttpServletResponse response, String type, String size) throws IOException {
        InputStream gmeList = Oppo.getTopGmeListInputStream(type.strip(), size.strip());
        deseriliseData(type, response, gmeList);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        System.out.println("hello doPost");
    }

    public void destroy() {
    }
}