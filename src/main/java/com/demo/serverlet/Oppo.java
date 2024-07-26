package com.demo.serverlet;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

class Oppo {
    private static String oka = "cdb09c43063ea6bb";
    private static String TOKEN = "STORENEWMIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBANYFY/UJGSzhIhpx6YM5KJ9yRHc7YeURxzb9tDvJvMfENHlnP3DtVkOIjERbpsSd76fjtZnMWY60TpGLGyrNkvuV40L15JQhHAo9yURpPQoI0eg3SLFmTEI/MUiPRCwfwYf2deqKKlsmMSysYYHX9JiGzQuWiYZaawxprSuiqDGvAgMBAAECgYEAtQ0QV00gGABISljNMy5aeDBBTSBWG2OjxJhxLRbndZM81OsMFysgC7dq+bUS6ke1YrDWgsoFhRxxTtx/2gDYciGp/c/h0Td5pGw7T9W6zo2xWI5oh1WyTnn0Xj17O9CmOk4fFDpJ6bapL+fyDy7gkEUChJ9+p66WSAlsfUhJ2TECQQD5sFWMGE2IiEuz4fIPaDrNSTHeFQQr/ZpZ7VzB2tcG7GyZRx5YORbZmX1jR7l3H4F98MgqCGs88w6FKnCpxDK3AkEA225CphAcfyiH0ShlZxEXBgIYt3V8nQuc/g2KJtiV6eeFkxmOMHbVTPGkARvt5VoPYEjwPTg43oqTDJVtlWagyQJBAOvEeJLno9aHNExvznyD4/pR4hec6qqLNgMyIYMfHCl6d3UodVvC1HO1/nMPl+4GvuRnxuoBtxj/PTe7AlUbYPMCQQDOkf4sVv58tqslO+I6JNyHy3F5RCELtuMUR6rG5x46FLqqwGQbO8ORq+m5IZHTV/Uhr4h6GXNwDQRh1EpVW0gBAkAp/v3tPI1riz6UuG0I6uf5er26yl5evPyPrjrD299L4Qy/1EIunayC7JYcSGlR01+EDYYgwUkec+QgrRC/NstV";
    public static final int[] f57129 = {119, 41, 115, 38, 35, 32, 38, 112, 119, 37, 117, 38, 32, 39, 116, 117, 39, 119, 39, 112, 40, 32, 37, 117, 35, 37, 37, 33, 119, 36, 112, 112};
    public static final String f57124 = "/upgrade/v1/inner";

    public static void main(String[] args) {
//        getTopGmeList("81");


    }

//    static byte[] getRankList(String type) {
//        String domin = "https://api-cn.store.heytapmobi.com";
//
//
//        try {
////            String encode = URLEncoder.encode(path, "UTF-8");
////
////            System.out.println(encode);
////            String temp = "%2Fcard%2Fstore%2Fv3%2Fcat%2Fresources%2Falg%2F1%3FsubId%3D0%26start%3D0%26size%3D10%26page_ext%3D304_1%26cid%3D81";
////
//
//            String start = "0";
//            String size = "10";
//            String t = "1721636218328";
//            System.out.println(getSign(start, size, t,type));
//
//
//            System.out.println(getSg(start, size, t, type));
//
//            String path = "/card/store/v3/cat/resources/alg/1?subId=0&start=" + start + "&size=" + size + "&page_ext=304_1&cid=81";
//            String urlPath = domin.concat(path);
//            System.out.println(urlPath);
//
//            URL url = new URL(urlPath);
//            StringBuffer buffer = new StringBuffer();
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("GET");
//            conn.setConnectTimeout(15000);
//            conn.setRequestProperty("User-Agent", "HUAWEI%2FBNE-AL00%2F32%2F12%2FUNKN");
//            conn.setRequestProperty("Accept", "application/x2-protostuff; charset=UTF-8");
//            conn.setRequestProperty("Accept-Encoding", "gzip");
//            conn.setRequestProperty("is_guest_mode", "0");
//            conn.setRequestProperty("romver", "-1");
//            conn.setRequestProperty("sign", getSign(start, size, t,type));
//            conn.setRequestProperty("pid", "001");
//            conn.setRequestProperty("device_type", "0");
//            conn.setRequestProperty("trace_ts", "1721634972758");
//            conn.setRequestProperty("sysua", "Dalvik/2.1.0 (Linux; U; Android 12; BNE-AL00 Build/V417IR)");
//            conn.setRequestProperty("client-ext-cardstyle", "100");
//            conn.setRequestProperty("id", "///");
//            conn.setRequestProperty("ocp", "eduzone#0_webview#4_stat#6_qrcode#0_FloatingAd#1_appupload#0_push#0_network#7_openphone#4_appactivate#1_security#11_download#24_abtest#0_h5preload#3_ui#31_common#11_download2#18_track#0_extEmpower#0");
//            conn.setRequestProperty("ocs", "HUAWEI%2FBNE-AL00%2F32%2F12%2FUNKNOWN%2F2%2FV417IR+release-keys%2F111502");
//            conn.setRequestProperty("screen-density", "240");
//            conn.setRequestProperty("appversion", "11.15.0");
//            conn.setRequestProperty("l_from", "com.mumu.launcher");
//            conn.setRequestProperty("pkg-ver", "0");
//            conn.setRequestProperty("ext-info", "normal");
//            conn.setRequestProperty("supported-locales", "zh-CN");
//            conn.setRequestProperty("support", "2=1");
//            conn.setRequestProperty("cpu-abilist", "x86_64,arm64-v8a,x86,armeabi-v7a,armeabi");
//            conn.setRequestProperty("user-region", "CN");
//            conn.setRequestProperty("cdo-gslb", "1");
//            conn.setRequestProperty("baggage", "ums.e2e_logging.severity=9");
//            conn.setRequestProperty("cpu-arch", "x86_64");
//            conn.setRequestProperty("nw", "1");
//            conn.setRequestProperty("enter-id", "1");
//            conn.setRequestProperty("locale", "zh-CN;CN");
//            conn.setRequestProperty("security_guard", "-1");
//            conn.setRequestProperty("ouid-limit-status", "0");
//            conn.setRequestProperty("sg", getSg(start, size, t, type));
//            conn.setRequestProperty("oak", "cdb09c43063ea6bb");
//            conn.setRequestProperty("dpi", "240");
//            conn.setRequestProperty("supported-abis", "x86_64,arm64-v8a,x86,armeabi-v7a,armeabi");
//            conn.setRequestProperty("ch", "2101");
//            conn.setRequestProperty("component", "111502/2");
//            conn.setRequestProperty("t", t);
//            conn.setRequestProperty("client-ext-third-line-activity", "0");
//            conn.setRequestProperty("t-request-id", "soGJjHyq-1721634978200");
//            conn.setRequestProperty("traceparent", "00-5ac12b7129424dfad2bdc9838def4fa5-daac4005d2b7addd-00");
//            conn.setRequestProperty("appid", "HUAWEI#001#CN");
//            conn.setRequestProperty("compresstool", "zstd-1.5.2-2");
//            conn.setRequestProperty("pr", "1");
//            conn.setReadTimeout(5000);
//            conn.connect();
//            // 获取状态码
//            int code = conn.getResponseCode();
//            if (code == 200) {// 请求成功
//                // 获取响应消息的实体内容
////                InputStreamReader reader = new InputStreamReader(
////                        conn.getInputStream());
////                char[] charArr = new char[1024 * 8];
////                int len = 0;
////                while ((len = reader.read(charArr)) != -1) {
////                    // 字符数组转字符串
////                    String str = new String(charArr, 0, len);
////                    // 在结尾追加字符串
////                    buffer.append(str);
////                }
//                return readFully(conn.getInputStream());
//
//            }
//
//        } catch (Throwable e2) {
//            e2.printStackTrace();
//            System.out.println(e2.getMessage());
//        }
//        return null;
//    }
    static InputStream getTopGmeListInputStream(String type, String size) {
        String domin = "https://api-cn.store.heytapmobi.com";


        try {

            String start = "0";
            String t = System.currentTimeMillis()+"";
//            System.out.println(getSign(start, size, t,type));
//            System.out.println(getSg(start, size, t, type));

            String path = "/card/store/v3/cat/resources/alg/1?subId=0&start=" + start + "&size=" + size + "&page_ext=304_1&cid=" + type;
            String urlPath = domin.concat(path);
//            System.out.println(urlPath);

            URL url = new URL(urlPath);
            StringBuffer buffer = new StringBuffer();
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(15000);
            conn.setRequestProperty("User-Agent", "HUAWEI%2FBNE-AL00%2F32%2F12%2FUNKN");
            conn.setRequestProperty("Accept", "application/x2-protostuff; charset=UTF-8");
            conn.setRequestProperty("Accept-Encoding", "gzip");
            conn.setRequestProperty("is_guest_mode", "0");
            conn.setRequestProperty("romver", "-1");
            conn.setRequestProperty("sign", getSign(start, size, t,type));
            conn.setRequestProperty("pid", "001");
            conn.setRequestProperty("device_type", "0");
            conn.setRequestProperty("trace_ts", t);
            conn.setRequestProperty("sysua", "Dalvik/2.1.0 (Linux; U; Android 12; BNE-AL00 Build/V417IR)");
            conn.setRequestProperty("client-ext-cardstyle", "100");
            conn.setRequestProperty("id", "///");
            conn.setRequestProperty("ocp", "eduzone#0_webview#4_stat#6_qrcode#0_FloatingAd#1_appupload#0_push#0_network#7_openphone#4_appactivate#1_security#11_download#24_abtest#0_h5preload#3_ui#31_common#11_download2#18_track#0_extEmpower#0");
            conn.setRequestProperty("ocs", "HUAWEI%2FBNE-AL00%2F32%2F12%2FUNKNOWN%2F2%2FV417IR+release-keys%2F111502");
            conn.setRequestProperty("screen-density", "240");
            conn.setRequestProperty("appversion", "11.15.0");
//            conn.setRequestProperty("l_from", "com.mumu.launcher");
            conn.setRequestProperty("l_from", "android");
            conn.setRequestProperty("pkg-ver", "0");
            conn.setRequestProperty("ext-info", "normal");
            conn.setRequestProperty("supported-locales", "zh-CN");
            conn.setRequestProperty("support", "2=1");
            conn.setRequestProperty("cpu-abilist", "x86_64,arm64-v8a,x86,armeabi-v7a,armeabi");
            conn.setRequestProperty("user-region", "CN");
            conn.setRequestProperty("cdo-gslb", "1");
            conn.setRequestProperty("baggage", "ums.e2e_logging.severity=9");
            conn.setRequestProperty("cpu-arch", "x86_64");
            conn.setRequestProperty("nw", "1");
            conn.setRequestProperty("enter-id", "1");
            conn.setRequestProperty("locale", "zh-CN;CN");
            conn.setRequestProperty("security_guard", "-1");
            conn.setRequestProperty("ouid-limit-status", "0");
            conn.setRequestProperty("sg", getSg(start, size, t, type));
            conn.setRequestProperty("oak", "cdb09c43063ea6bb");
            conn.setRequestProperty("dpi", "240");
            conn.setRequestProperty("supported-abis", "x86_64,arm64-v8a,x86,armeabi-v7a,armeabi");
            conn.setRequestProperty("ch", "2101");
            conn.setRequestProperty("component", "111502/2");
            conn.setRequestProperty("t", t);
            conn.setRequestProperty("client-ext-third-line-activity", "0");
            conn.setRequestProperty("t-request-id", "RBBYIrPP-1721787899467");
            conn.setRequestProperty("traceparent", "00-63842f9ec5ff1e34230112ae89d43ba0-b57c29b1ba2907cb-00");
            conn.setRequestProperty("appid", "HUAWEI#001#CN");
            conn.setRequestProperty("compresstool", "zstd-1.5.2-2");
            conn.setRequestProperty("pr", "1");
            conn.setReadTimeout(5000);
            conn.connect();
            // 获取状态码
            int code = conn.getResponseCode();
            if (code == 200) {// 请求成功
                // 获取响应消息的实体内容
//                InputStreamReader reader = new InputStreamReader(
//                        conn.getInputStream());
//                char[] charArr = new char[1024 * 8];
//                int len = 0;
//                while ((len = reader.read(charArr)) != -1) {
//                    // 字符数组转字符串
//                    String str = new String(charArr, 0, len);
//                    // 在结尾追加字符串
//                    buffer.append(str);
//                }
                return conn.getInputStream();

            }

        } catch (Throwable e2) {
            e2.printStackTrace();
            System.out.println(e2.getMessage());
        }
        return null;
    }
    static InputStream getRankList(String type, String size) {
        String domin = "https://api-cn.store.heytapmobi.com";
        try {
//            String encode = URLEncoder.encode(path, "UTF-8");
//
//            System.out.println(encode);
//            String temp = "%2Fcard%2Fstore%2Fv3%2Fcat%2Fresources%2Falg%2F1%3FsubId%3D0%26start%3D0%26size%3D10%26page_ext%3D304_1%26cid%3D81";
//
            String start = "0";
//            String size = "100";
            String t = System.currentTimeMillis()+"";

            ///card/store/v3/subject/50004166?start=0&installRemoval=1&subType=4&size=10&pt=3001

            String path = "/card/store/v3/subject/"+ type +"?start=" + start + "&installRemoval=1&subType=4&size=" + size + "&pt=3001";
            ///card/store/v3/subject/50004166start=0&installRemoval=1&subType=4&size=10&pt=3001



            String urlPath = domin.concat(path);
//            System.out.println(urlPath);
//            System.out.println(getSign(t,path));
            URL url = new URL(urlPath);

            path = path.replace("?","");

//            System.out.println("sign=" + getSign(t,path));

//            System.out.println(getSg(start, size, t, type));

            StringBuffer buffer = new StringBuffer();
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(15000);
            conn.setRequestProperty("User-Agent", "HUAWEI%2FBNE-AL00%2F32%2F12%2FUNKNOWN%2F2%2F2101%2F111502%2F11.15.0");
            conn.setRequestProperty("Accept", "application/x2-protostuff; charset=UTF-8");
            conn.setRequestProperty("Accept-Encoding", "gzip");
            conn.setRequestProperty("is_guest_mode", "0");
            conn.setRequestProperty("romver", "-1");
            conn.setRequestProperty("sign", getSign(t,path));
            conn.setRequestProperty("pid", "001");
            conn.setRequestProperty("device_type", "0");
            conn.setRequestProperty("trace_ts", t);
            conn.setRequestProperty("sysua", "Dalvik/2.1.0 (Linux; U; Android 12; BNE-AL00 Build/V417IR)");
            conn.setRequestProperty("client-ext-cardstyle", "100");
            conn.setRequestProperty("id", "///");
            conn.setRequestProperty("ocp", "eduzone#0_webview#4_stat#6_qrcode#0_FloatingAd#1_appupload#0_push#0_network#7_openphone#4_appactivate#1_security#11_download#24_abtest#0_h5preload#3_ui#31_common#11_download2#18_track#0_extEmpower#0");
            conn.setRequestProperty("ocs", "HUAWEI%2FBNE-AL00%2F32%2F12%2FUNKNOWN%2F2%2FV417IR+release-keys%2F111502");
            conn.setRequestProperty("screen-density", "240");
            conn.setRequestProperty("appversion", "11.15.0");
//            conn.setRequestProperty("l_from", "com.mumu.launcher");
            conn.setRequestProperty("l_from", "android");
            conn.setRequestProperty("pkg-ver", "0");
            conn.setRequestProperty("ext-info", "normal");
            conn.setRequestProperty("supported-locales", "zh-CN");
            conn.setRequestProperty("support", "2=1");
            conn.setRequestProperty("cpu-abilist", "x86_64,arm64-v8a,x86,armeabi-v7a,armeabi");
            conn.setRequestProperty("user-region", "CN");
            conn.setRequestProperty("cdo-gslb", "1");
            conn.setRequestProperty("baggage", "ums.e2e_logging.severity=9");
            conn.setRequestProperty("cpu-arch", "x86_64");
            conn.setRequestProperty("nw", "1");
            conn.setRequestProperty("enter-id", "1");
            conn.setRequestProperty("locale", "zh-CN;CN");
            conn.setRequestProperty("security_guard", "-1");
            conn.setRequestProperty("ouid-limit-status", "0");
            conn.setRequestProperty("sg", getSg(start, size, t, type));
            conn.setRequestProperty("oak", "cdb09c43063ea6bb");
            conn.setRequestProperty("dpi", "240");
            conn.setRequestProperty("supported-abis", "x86_64,arm64-v8a,x86,armeabi-v7a,armeabi");
            conn.setRequestProperty("ch", "2101");
            conn.setRequestProperty("component", "111502/2");
            conn.setRequestProperty("t", t);
            conn.setRequestProperty("client-ext-third-line-activity", "0");
            conn.setRequestProperty("t-request-id", "RBBYIrPP-1721787899467");
            conn.setRequestProperty("traceparent", "00-63842f9ec5ff1e34230112ae89d43ba0-b57c29b1ba2907cb-00");
            conn.setRequestProperty("appid", "HUAWEI#001#CN");
            conn.setRequestProperty("compresstool", "zstd-1.5.2-2");
            conn.setRequestProperty("pr", "1");
            conn.setReadTimeout(5000);
            conn.connect();
            // 获取状态码
            int code = conn.getResponseCode();
            if (code == 200) {// 请求成功
                // 获取响应消息的实体内容
//                InputStreamReader reader = new InputStreamReader(
//                        conn.getInputStream());
//                char[] charArr = new char[1024 * 8];
//                int len = 0;
//                while ((len = reader.read(charArr)) != -1) {
//                    // 字符数组转字符串
//                    String str = new String(charArr, 0, len);
//                    // 在结尾追加字符串
//                    buffer.append(str);
//                }
                return conn.getInputStream();

            }

        } catch (Throwable e2) {
            e2.printStackTrace();
            System.out.println(e2.getMessage());
        }
        return null;
    }

    public static byte[] readFully(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024]; // 创建缓冲区
        int bytesRead = 0;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        // 读取输入流直到没有更多的数据
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
        return outputStream.toByteArray(); // 返回字节数组
    }

    public static String getSg(String start, String size, String t, String type) throws NoSuchAlgorithmException {
        MessageDigest md52 = MessageDigest.getInstance("SHA1");
//        String sgData = "%2fcard%2fstore%2fv3%2fcat%2fresources%2falg%2f1subid%3d0%26start%3d" + start + "%26size%3d" + size + "%26page_ext%3d304_1%26cid%3d"  + type+ "application/x2-protostuff; charset=utf-8get///" + t + "c5ca81b0391663db0ca3e6b70c4e0fc4cf53ead33d158e83218";
        String sgData = "%2fcard%2fstore%2fv3%2fcat%2fresources%2falg%2f1subid%3d0%26start%3d" + start + "%26size%3d" + size + "%26page_ext%3d304_1%26cid%3d"  + type+ "application/x2-protostuff; charset=utf-8get///" + t + "cab2f5d94d4eea71d9275c219e852eb5e60cb5ceccd523b5218";
//        System.out.println(sgData);
        md52.update(sgData.getBytes());
        byte[] digest2 = md52.digest();
        StringBuffer stringBuffer2 = getStringBuffer(digest2);
        return stringBuffer2.toString();
    }

    public static String getSign(String t, String path) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        String key = "cdb09c43063ea6bb08f4fe8a43775179bdc58acb383220be";
//        System.out.println(key.length());
        md5.update(key.getBytes());
        String data = "HUAWEI%2FBNE-AL00%2F32%2F12%2FUNKNOWN%2F2%2FV417IR+release-keys%2F111502" + t + "///"+path;
        md5.update(data.getBytes());
//        System.out.println(data.length());
        int totalLength = key.length() + data.length();
        String length = String.valueOf(totalLength);
        md5.update(length.getBytes());
        md5.update(TOKEN.getBytes());
        byte[] digest = md5.digest();
        StringBuffer stringBuffer = getStringBuffer(digest);
        return stringBuffer.toString();
    }

    public static String getSign(String start, String size, String t, String type) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        String key = "cdb09c43063ea6bb08f4fe8a43775179bdc58acb383220be";
//        System.out.println(key.length());
        md5.update("cdb09c43063ea6bb08f4fe8a43775179bdc58acb383220be".getBytes());
        String data = "HUAWEI%2FBNE-AL00%2F32%2F12%2FUNKNOWN%2F2%2FV417IR+release-keys%2F111502" + t + "////card/store/v3/cat/resources/alg/1subId=0&start=" + start + "&size=" + size + "&page_ext=304_1&cid=" + type;
        md5.update(data.getBytes());
//        System.out.println(data.length());
        int totalLength = key.length() + data.length();
        String length = String.valueOf(totalLength);
        md5.update(length.getBytes());
        md5.update(TOKEN.getBytes());
        byte[] digest = md5.digest();
        StringBuffer stringBuffer = getStringBuffer(digest);
        return stringBuffer.toString();
    }

    private static StringBuffer getStringBuffer(byte[] digest) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : digest) {
            int i = b & 255;
            if (i < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i));
        }
        return stringBuffer;
    }


    public static String m60560(int[]... arrays) {
        int length = arrays.length;
        int i = 0;
        for (int[] iArr : arrays) {
            i += iArr.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            System.arraycopy(m60561(arrays[i3]), 0, bArr, i2, arrays[i3].length);
            i2 += arrays[i3].length;
        }
        return new String(bArr);
    }

    private static byte[] m60561(int[] intArray) {
        int length = intArray.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (intArray[i] ^ 17);
        }
        return bArr;
    }


    public static String m60623(byte[] bytes) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bytes);
            StringBuffer stringBuffer = getStringBuffer(digest);
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e2) {
//            com.heytap.upgrade.log.c.m60342(f57181, "getMD5 failed : " + e2.getMessage());
            return String.valueOf(Arrays.hashCode(bytes));
        }
    }

}