//http://www.iteye.com/topic/84206
//http://www.cnblogs.com/aLittleBitCool/archive/2011/11/05/2234871.html
public class My{
  public static void  main(String[] args){
	String url = "http://bbs.tianya.cn/post-78-575154-1.shtml";
	if(url.contains("bbs.tianya.cn/post-79") 
		|| url.contains("bbs.tianya.cn/list-79")){ 
		    System.out.println("hello,yes");	
	}else{
		    System.out.println("hello,no");
	}
  }
}
