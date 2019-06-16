package AllCodes;

public class RemoveDuplicate {
    public void  removeDup(String str) {
	String res = "";
	int len = str.length();
	for(int iter = 0; iter < len; iter++) {
	    if(iter == 0) {
		res = res + str.charAt(iter);
	    }
	    else {
		String s = new String(new char[] {str.charAt(iter)});
		if(res.indexOf(s) == ' '){
		    res = res + " ";
		}else if(res.indexOf(s) == -1 ) {
		    res = res + s;
		}
	    }
	}
	System.out.println(res);
	return;
    }
}
