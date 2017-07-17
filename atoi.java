package LeetCode;

public class atoi {

	public static int myAtoi(String str) {
        
		int flag =0;
		if(!str.contains("0") && !str.contains("1") && !str.contains("2") && !str.contains("3") && !str.contains("4")&&
				!str.contains("5") && !str.contains("6") && !str.contains("7") && !str.contains("8") && !str.contains("9")){
           return 0;
        }
		
		if(str.contains(".")){
        	str = str.substring(0, str.indexOf("."));
        }

		if(str.charAt(0)== '-')
			flag =1;
	    String strNew = "" ;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>=48 && str.charAt(i)<=59){
				strNew = strNew + str.charAt(i);
			}
		}
		
		if(strNew.length() >10){
		  return 0;	
		}
		if(flag == 1)
			strNew = '-' + strNew;
			
		//System.out.println(str);
		//System.out.println("strNew " + strNew);
        long num1 = Long.parseLong(strNew);
		int intNum = (int)num1;
        if(intNum > Integer.MAX_VALUE || intNum < Integer.MIN_VALUE){
			return 0;
		}
		return intNum;
    }
	
	public static void main(String[] args) {
		
		//int res = myAtoi("0001235.4333");
		int res = myAtoi("-1");
		
		System.out.println(res);
		
	}
	
	
}

/*str = str.substring(str.lastIndexOf(" ")+1,str.length());
if(str.equals("") || str.contains("+")||str.contains("-")){
	return 0;
}*/


//System.out.println(Integer.MAX_VALUE);
//int num = Integer.parseInt(str);
