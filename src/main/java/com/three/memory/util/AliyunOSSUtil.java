package com.three.memory.util;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.*;
import com.three.memory.constant.SystemCon;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @BelongsProject: memory
 * @BelongsPackage: com.three.memory.util
 * @Author: Administrator
 * @Description: OSS工具类
 */
public class AliyunOSSUtil {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(AliyunOSSUtil.class);


    /**
     * 上传文件
     * @param file 文件
     * @return url
     */
    public static String upload(MultipartFile file) throws IOException {
        //获取文件名
        String filename = file.getOriginalFilename();
        //新建文件
        File newFile = new File(filename);
        //获取文件输出流
        FileOutputStream os = new FileOutputStream(newFile);
        //转换文件为字节输出流
        os.write(file.getBytes());
        os.close();
        file.transferTo(newFile);
        logger.info("=========>OSS文件上传开始："+newFile.getName());
        String endpoint= SystemCon.endpoint;
        String accessKeyId=SystemCon.accessKeyId;
        String accessKeySecret=SystemCon.accessKeySecret;
        String bucketName=SystemCon.bucketName;
        String fileHost=SystemCon.filehost;

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = format.format(new Date());

        if(null == newFile){
            return null;
        }

        OSSClient ossClient = new OSSClient(endpoint,accessKeyId,accessKeySecret);
        try {
            //容器不存在，就创建
            if(! ossClient.doesBucketExist(bucketName)){
                ossClient.createBucket(bucketName);
                CreateBucketRequest createBucketRequest = new CreateBucketRequest(bucketName);
                createBucketRequest.setCannedACL(CannedAccessControlList.PublicRead);
                ossClient.createBucket(createBucketRequest);
            }
            //创建文件路径
            String fileUrl = fileHost+"/"+(dateStr + "/" + UUID.randomUUID().toString().replace("-","")+"-"+newFile.getName());
            //上传文件
            PutObjectResult result = ossClient.putObject(new PutObjectRequest(bucketName, fileUrl, newFile));

            //设置权限 这里是公开读
            ossClient.setBucketAcl(bucketName,CannedAccessControlList.PublicRead);
            if(null != result){
                logger.info("==========>OSS文件上传成功,OSS地址："+fileUrl);
                return "https://mymemory.oss-cn-beijing.aliyuncs.com/" + fileUrl;
            }
        }catch (OSSException oe){
            logger.error(oe.getMessage());
        }catch (ClientException ce){
            logger.error(ce.getMessage());
        }finally {
            //关闭
            ossClient.shutdown();
        }
        return null;
    }

    /**
     * 删除Object
     * @param fileKey
     * @return
     */
    public static String deleteBlog(String fileKey){
        logger.info("=========>OSS文件删除开始");
        String endpoint= SystemCon.endpoint;
        String accessKeyId=SystemCon.accessKeyId;
        String accessKeySecret=SystemCon.accessKeySecret;
        String bucketName=SystemCon.bucketName;

        try {
            OSSClient ossClient = new OSSClient(endpoint,accessKeyId,accessKeySecret);

            if(!ossClient.doesBucketExist(bucketName)){
                logger.info("==============>您的Bucket不存在");
                return "您的Bucket不存在";
            }else {
                logger.info("==============>开始删除Object");
                ossClient.deleteObject(bucketName,fileKey);
                logger.info("==============>Object删除成功："+fileKey);
                return "==============>Object删除成功："+fileKey;
            }
        }catch (Exception ex){
            logger.info("删除Object失败",ex);
            return "删除Object失败";
        }
    }


    /**
     * 查询文件名列表
     * @param bucketName
     * @return
     */
//    public static List<String> getObjectList(String bucketName){
//        List<String> listRe = new ArrayList<>();
//        String endpoint= SystemCon.endpoint;
//        String accessKeyId=SystemCon.accessKeyId;
//        String accessKeySecret=SystemCon.accessKeySecret;
//        try {
//            logger.info("===========>查询文件名列表");
//            OSSClient ossClient = new OSSClient(endpoint,accessKeyId,accessKeySecret);
//            ListObjectsRequest listObjectsRequest = new ListObjectsRequest(bucketName);
//            //列出blog目录下今天所有文件
//            listObjectsRequest.setPrefix("blog/"+format.format(new Date())+"/");
//            ObjectListing list = ossClient.listObjects(listObjectsRequest);
//            for(OSSObjectSummary objectSummary : list.getObjectSummaries()){
//                listRe.add(objectSummary.getKey());
//            }
//            return listRe;
//        }catch (Exception ex){
//            logger.info("==========>查询列表失败",ex);
//            return new ArrayList<>();
//        }
//    }

}
