package priv.jesse.mall.entity.pojo;

import java.io.Serializable;
//pojo是指简单的java对象
/**
 * 接口返回数据模型
 *
 * @author hfb
 * @date 2017/9/18
 */
public class ResultBean<T> implements Serializable {
    private static final long serialVersionUID = -6248298306422072592L;
    /**
     * 表示接口调用成功
     */
    public static final int SUCCESS = 0;
    /**
     * 表示接口调用失败
     */
    public static final int FAIL = 1;
    /**
     * 表示没有权限调用该接口
     */
    public static final int NO_PERMISSION = 2;

    public static final String NO_LOGIN_MSG = "未登录";
    public static final String NO_PERMISSION_MSG = "没有权限";
    public static final String SUCC_MSG = "成功";
    public static final String FAIL_MSG = "失败";

    private String message = SUCC_MSG;
    private int state = SUCCESS;
    /**
     * 返回的数据
     */
    private T data;//创建泛型的私有变量
/*对构造方法进行方法重载*/
    public ResultBean() {//无参构造方法
        super();//继承父类“可序列化”
    }

    public ResultBean(T data) {//含参构造方法
        super();//继承父类“可序列化”
        this.data = data;//获取返回的泛型数据
    }

    /**
     * 包装异常信息
     *
     * @param e
     */
    public ResultBean(Throwable e) {//Throwable是java.lang包中一个专门用来处理异常的类。它有两个子类，即Error 和Exception，它们分别用来处理两组异常。
        super();//继承父类
        this.message = e.getMessage();//获取此异常的详细字符串
        this.state = FAIL;//状态设置为“失败”
    }

    public ResultBean(String message) {
        super();
        this.message = message;
        this.state = FAIL;
    }
    /*因为这些变量是私有类型，所以只能通过set，get方法访问*/
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {//重写toString方法，返回值设为一个自定义语句，当需要这个自定义的语句时直接调用这个方法即可
        return "ResultBean{" +
                "message='" + message + '\'' +
                ", state=" + state +
                ", data=" + data +
                '}';
    }
}
