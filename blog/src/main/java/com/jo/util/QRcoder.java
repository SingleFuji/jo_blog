package com.jo.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Path;
import java.util.Hashtable;
import java.util.Map;

import javax.imageio.ImageIO; 

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import com.google.zxing.DecodeHintType; 
import com.google.zxing.LuminanceSource; 
import com.google.zxing.MultiFormatReader; 
import com.google.zxing.Result; 
import com.google.zxing.client.j2se.BufferedImageLuminanceSource; 
import com.google.zxing.common.HybridBinarizer;

public class QRcoder {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        encode();
        decode();
    }
    
    static void encode(){
        try{
            StringBuilder sb = new StringBuilder(1024);
//            sb.append("Name:TomPandas");
//            sb.append("\r\n");
            sb.append("weixin://wxpay/bizpayurl?pr=5jwiJRO");
//            sb.append("\r\n");    
            String str = sb.toString();
            
            String picFormat = "png";
            String path = "d:/test_qrcode";
            File file = new File(path + "." + picFormat);
            str = new String(str.getBytes("GBK"), "ISO-8859-1");
            Hashtable hints = new Hashtable();
            BitMatrix bitMatrix = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, 200, 200, hints);
            MatrixToImageWriter.writeToFile(bitMatrix, picFormat, file);
//            MatrixToImageWriter.writeToPath(bitMatrix, picFormat, file);
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    
    static void decode(){
        try{
            String file = "d:/test_qrcode.png";
            Result result = null; 
            BufferedImage image = null;
            
            image = ImageIO.read(new File(file));
            LuminanceSource source = new BufferedImageLuminanceSource(image); 
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source)); 
//            Hashtable<Object, Object> hints = new Hashtable<Object, Object>();
            Map<DecodeHintType,String> hints = new Hashtable<DecodeHintType, String>();
            hints.put(DecodeHintType.CHARACTER_SET, "GBK"); 
            result = new MultiFormatReader().decode(bitmap, hints); 
            String rtn = result.getText();
            System.out.println(rtn);
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

}