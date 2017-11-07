import java.util.StringTokenizer;
public class Desktop {
public static void main(String[] args) {
// TODO Auto-generated method stub
String line = "75 51 25 20 21 15 29 16 22 22 28 16 25 13 25 31 50
20 51 38 24 13 126";
StringTokenizer st = new StringTokenizer(line," ");
int yc=Integer.parseInt(st.nextToken());
int nc=Integer.parseInt(st.nextToken());
int a1yc=Integer.parseInt(st.nextToken());
int a1nc=Integer.parseInt(st.nextToken());
int a2yc=Integer.parseInt(st.nextToken());
int a2nc=Integer.parseInt(st.nextToken());
int a3yc=Integer.parseInt(st.nextToken());
int a3nc=Integer.parseInt(st.nextToken());
int hyc=Integer.parseInt(st.nextToken());
int hnc=Integer.parseInt(st.nextToken());
int myc=Integer.parseInt(st.nextToken());
int mnc=Integer.parseInt(st.nextToken());
int lyc=Integer.parseInt(st.nextToken());
int lnc=Integer.parseInt(st.nextToken());
int yyc=Integer.parseInt(st.nextToken());
int ync=Integer.parseInt(st.nextToken());
int nyc=Integer.parseInt(st.nextToken());
int nnc=Integer.parseInt(st.nextToken());
int fyc=Integer.parseInt(st.nextToken());
int fnc=Integer.parseInt(st.nextToken());
int eyc=Integer.parseInt(st.nextToken());
int enc=Integer.parseInt(st.nextToken());
int tl = Integer.parseInt(st.nextToken());
String[] test = new String[]{">40","lw","no","fr"};
double prys= (double)yc/tl; //P(yes)
double prno= (double)nc/tl; //P(no)
for (int i = 0; i < test.length; i++) {
String vl = test[i];
if(vl.equals("<=30")){
prys *= (double)a1yc/yc;//P(<=30/yes)
prno *= (double)a1nc/nc; //P(<=30/no)
}else if(vl.equals("31..40")){
prys *= (double)a2yc/yc;//P(31..40/yes)
prno *= (double)a2nc/nc; //P(31..40/no)
}else if(vl.equals(">40")){
prys *= (double)a3yc/yc;//P(>40/yes)
prno *= (double)a3nc/nc; //P(>40/no)
}else if(vl.equals("hi")){
prys *= (double)hyc/yc;//P(high/yes)
prno *= (double)hnc/nc; //P(high/no)
}else if(vl.equals("md")){
prys *= (double)myc/yc;//P(medium/yes)
prno *= (double)mnc/nc; //P(medium/no)
}else if(vl.equals("lw")){
prys *= (double)lyc/yc;//P(low/yes)
prno *= (double)lnc/nc; //P(low/no)
}else if(vl.equals("ys")){
prys *= (double)yyc/yc;//P(yes/yes)
prno *= (double)ync/nc; //P(yes/no)
}else if(vl.equals("no")){
prys *= (double)nyc/yc;//P(no/yes)
prno *= (double)nnc/nc; //P(no/no)
}else if(vl.equals("fr")){
prys *= (double)fyc/yc;//P(fair/yes)
prno *= (double)fnc/nc; //P(fair/no)
}else if(vl.equals("ex")){
prys *= (double)eyc/yc;//P(excellent/yes)
prno *= (double)enc/nc; //P(excellent/no)
}
}
String result = prys>prno? "will buy\n": "will not buy \n";
System.out.println(result+"yes:"+prys+" no:"+prno);
if(prys>prno)
System.out.println("The customer will buy the
product");
else
System.out.println("The customer will not buy the
product");
}
}
