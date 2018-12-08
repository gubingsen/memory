package com.three.memory.constant;


public class SystemCon {
    //返回码
    public static final int ROK=100000;
    public static final int RERROR1=100001;
    public static final int RERROR2=100002;
    public static final int RERROR3=100003;
    public static final int RERROR4=100004;

    //请求方式
    public static final String GET="GET";
    public static final String POST="POST";

    //需要用到秘钥  token AES
    public static final String TOKENKEY="Hek0nG7FXhO2pzxelPFoog==";
    public static final String PASSKEY="L+GRoop7TLMIHm9lBGfWoA==";

    //redis中token的键
    public static final String REDISTOKEN="token";


    //oss配置
    public static final String endpoint="oss-cn-beijing.aliyuncs.com";
    public static final String accessKeyId="LTAIzivGlmVMlGJ8";
    public static final String accessKeySecret="uMEjqVuxmMJ6ix2AGUpA4BOLI6Fse5";
    public static final String bucketName="mymemory";
    public static final String filehost="media";

}
