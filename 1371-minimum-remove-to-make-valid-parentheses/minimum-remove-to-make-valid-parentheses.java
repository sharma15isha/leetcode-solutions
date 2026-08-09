class Solution {
    public String minRemoveToMakeValid(String s) {
      StringBuilder result=new StringBuilder();
     int count=0;

      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch == '('){
            count++;

            if(count>0){
                result.append(ch);
            }
        }

        else if(ch == ')'){
            if(count>0){
                count--;
                result.append(ch);
            }
        }

        else{
           result.append(ch);
        }
      }
      StringBuilder answer=new StringBuilder();
      for(int i=result.length()-1;i>=0;i--){
        char ch= result.charAt(i);

        if(ch == '(' && count>0){
            count--;
        }
        else{
            answer.append(ch);
        }
      }
      return answer.reverse().toString();


    }
}