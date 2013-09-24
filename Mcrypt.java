public class Mcrypt { 
	
    public String passport_encrypt(String strOld, String strKey) {
       byte[] data = strOld.getBytes();
       byte[] keyData = strKey.getBytes();
       int keyIndex = 0 ;
       for(int x = 0 ; x < strOld.length() ; x++) {
         data[x] = (byte)(data[x] ^ keyData[keyIndex]);
         if (++keyIndex == keyData.length){
             keyIndex = 0;
         }
       }
       return new String(data);
   }  
   public String passport_decrypt(String strOld, String strKey) {
       byte[] data = strOld.getBytes();
       byte[] keyData = strKey.getBytes();
       int keyIndex = 0 ;
       for(int x = 0 ; x < strOld.length() ; x++) {
         data[x] = (byte)(data[x] ^ keyData[keyIndex]);
         if (++keyIndex == keyData.length){
             keyIndex = 0;
         }
       }
       return new String(data);
   }  
}  
public void main(String[] args) {
   obj = new Mcrypt();
   System.out.println("Encode:text\n\r");  
   //加密：
   String txt = obj->passport_encrypt("test",123);
   //解密：

   System.out.println(txt);  
   System.out.println("Decode\n\r"); 
   String outs = obj->passport_decrypt(txt,123);
   System.out.println(outs);  
   System.out.println("End\n\r");  
} 
