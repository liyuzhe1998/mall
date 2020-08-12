package priv.jesse.mall.utils;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016102000727621";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDbzBYRDRXvvNYW8oinoxFL9YIPMLbVevfk78iWJxGNMsYjYwkve5j46ExTxWw0fLzHOrDjYGNqO0zVYDbfyVg0nigsx2tbpLfeUmWt3mzMAO0sf8Dy97ykur05pLbCjmXfThdWTZ+lnn5bAoTdPX5KcsqYPzx39bep6AXLadycdzTmvn4Q1+hUxPisDWZBFPGUdFJKQA7lU7CrfF9o+guBI+ouHGXKij8QimPLw1AJtJBXKZPt2h+sIO4k8oZkCVmMX70KErGp9oIA5FWPBJ28R7A+a3nApurKyg6R3yseTB/2IDWJADNgLteUgRolS3DjM2pRGRLNCQ+GJgknHgQ3AgMBAAECggEAIiUZRHrY7o5SX+w7iHdPp5IzKzLxJEbfHcSWT6UwF9RMbZDkC2lTAU/tE5J21cyO8xBODHSb3RPrQraYr7kyp7HuIc61Ad6b5cC9JP6JvkNilOgfzF7qAlk0LjFFZwICF2elPnX+mBcAIBlLFKeJ5/zfNjmUpjoY1x9BTzFZ4UBlxIgAEB925zDJsME2xRiVXqcamGiFl7J8ulkRdrLVBowDhTjp0QDPvZCiq5JV7xuE1My4klHcOSbGVVpfUQgU4btDd/3NB6txldnpCJkUs5oVRcGjGiCInEZ3g9mIgEATeoREhuz7r2MR3o6jv4T8VcxSdDXSCzLd6I1gjjgncQKBgQD39wzvoaO4119zMOticAN/gX/2zP6GdMrPWXYINSOCgYEykNg4WxdbR36A+d2XVycSe5HkcpnKgYov1f29AMghwc6eow3QvrdQSLcSb8Ae7rG/45tCp3yOliXkyHl9SB20rjoVR+s7S4Y8mrrbgjgY0ZS8mcZ4GgDBUyRvJGvUXwKBgQDi61/e8fgWrjXmZp33SWcTzMnUxnmUtGyBjDcTfkJp4oRQvZ3rJ9IE8SSfZrrPxPKGeXacUe1qlum8BFvWtE/UTDXQC2jUNXzeQZTC67e6DWin93fcFGwYcerZyvrns1DmRlI5BF6NgeTldtUMHfCsQmJmZFACC1fvxQpf3E6fKQKBgQCj0mKHhwEFw7TaA73fgSWufb4vLewSpOLA7tfeQE0/kZPr9moDgZsCwU9AotPVgszblywiA9y7P64uQHCtB/Ew7Dw37n3YJcgykHfzBEWnqgdhQVx4QvM1uNk8N36cWKLXlivll2g/+nurWoaNM5EgRIbBu8611mgdUXLGwwdCfQKBgBs0XsUKu1R0xE+AA/YunaX5CkVxGghi7RNG7R9wJqQtHPHVGcakeoBPLLXTihf4o57NlxO8mrsJprH8z8nYyi1IibcMdx/h3buDn0MTIW6zxtVETOFcrWzs01wTAqueitdgnODrDi7m4LtF2NrgCAeO2d8urYzhMUS0mb7OWbqpAoGBALJtd/HGPWs47lWSra0QLPc9b0JdwJdfz+CerB79kr5rsWBuOn08kuRQJ4vLZVxdQY2zYhGsftoDUYmtVQTuPr6LYnaRZqiVi+f5EwsL/+WcMpbdMApmgNwirVwR6CzvZ9dsVNnuSrd4Kf1qoavpg1G8fOATOY3tgRc/i0NU/fO1";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvVvWdPrro7gVgIwh2qCydYcObw6PQSL8pMsncYHgsTerhMCrBtS1rAvN41A4wehzzFSOSQyPQVvvy5DZQhBj4RjL+VEfo6VPEN0lHMRd2s5QvXxvz+lHvxjIYl8k5+7k/O3sQwlX17Izwt+i92+82kKWylzBy9T+vXjBUCuusg3Y1S8Kzcj8YjVBkCAAJEW3e77jBwwZ+A9JCOMataMvexc2xD84foue4odAv9iK+AvlYBtW++XHszlZfJkLsckryYnr1N7zjp+og70iuLE8c6EqDHTUWPYnQQGMC6a+fTQcU70JK9UDglTSHlJB3Yg8bMAeYXTWEI0t1moBDk/P3QIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost/mall/alipay.trade.page.pay-JAVA-UTF-8tify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost/mall/order/toList.html";
    //http://localhost/mall/jump?pg=mall/order/list

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}