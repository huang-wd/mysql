
package com.ly.rw.cache;

/**
 * Description Of The Class<br/>
 * QQ:1211956756 
 *
 * @author 	(宗寿金 07814)
 * @version 1.0.0, 2015年2月4日-上午11:19:54
 * @since 2015年2月4日-上午11:19:54
 */
public class Test {

	public void test(){
		System.out.println("aasasasas");
	}
	
	public void test02(){
		System.out.println("22222222222222222");
	}
	
	public void test05(){
		System.out.println("555555555555555555555");
	}
	
	public void test03(){
		System.out.println("this is mehtod test03 this is test");
		System.out.println("333333333333");
		System.out.println("after method test03");
		System.out.println(getString("World"));
	}
	
	public void test04(){
		System.out.println("this is test04 method");
		System.out.println("333333333333");
	}
	
	public static String getString(String str){
		if(str == null || "".equals(str)){
			return "hahah";
		}
		System.out.println("asasasaaasasas");
		return "Hello "+str;
	}
}

