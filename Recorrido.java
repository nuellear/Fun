/**
 *
 * @author Emmanuel Salvador Leal Rangel
 */
public class Recorrido {
    
    public static void main(String[] args) {
        String codigo="Ynkxquip Nuqrky, wak ks as vx�si�v�u Jueqk zks�g vxkb�yzu qqgrgx\n" +
"Ynkxx�sluxj, ky as jkzkiz�bk vx�bgju, gqzu, jkqmgju, lx�u, �xus�iu,\n" +
"�smks�uyu k �szkqkizagqrkszk �swa�kzu. Cgzyus qu jkyix�hk l�y�igrkszk\n" +
"jkq y�ma�kszk ruju gq vuiu jk iusuikxykf\n" +
"\n" +
"Ya kyzgzaxg yuhxkvgyghg quy yk�y v�ky, e kxg zgs kdzxguxj�sgx�grkszk\n" +
"ksoazu, wak vxujai�g qg �rvxky�us jk ykx gas rgy gqzu. Zks�g qg r�xgjg\n" +
"gmajg e vkskzxgszk, e ya sgx�f, l�sg e gma�qktg, jghg gq iusoaszu jk yay\n" +
"lgii�usky as g�xk jk b�bkfg e jk xkyuqai�us.\n" +
"\n" +
"Gaswak rainuy ngs skmgju kyzg uvi�us, kq kyix�zux hgyu ya jkyix�vi�us\n" +
"jk Nuqrky ks as gsz�mau gr�mu jk qg lgiaqzgj, qqgrgju Ynkxx�sluxj, kq\n" +
"iagq qqkmu g luxrgx vgxzk jk Yiuzqgsj Egxj, mxgs gr�mu e gq�gju jk iusgs\n" +
"jueqk e iaegy jkyix�vi�usky jk b�bksi�gy vuq�i�gigy �syv�xgxus raingy jk\n" +
"yay uhxgy.";
        String abc="abcdefghijklmn�opqrstuvwxyz";
        String abc2="ABCDEFGHIJKLMN�OPQRSTUVWXYZ";
        String nuevo="";
          
        for(int i=0;i<codigo.length();i++){
                for(int j=0; j<abc.length(); j++){
                    if(codigo.charAt(i)==abc2.charAt(j)){
                        int aux=j-6;
                        if(aux<0)
                          aux=aux+27;   
                        nuevo=nuevo+abc2.charAt(aux);
                    }
                    if(codigo.charAt(i)==abc.charAt(j)){
                        int aux=j-6;
                        if(aux<0)
                          aux=aux+27;   
                        nuevo=nuevo+abc.charAt(aux);
                    }//FIN IF
                    
                }//FIN FOR abc (j)
                if(codigo.charAt(i)==' ')
                    nuevo=nuevo+" ";
                    
                if(codigo.charAt(i)==',')
                    nuevo=nuevo+",";
                
                if(codigo.charAt(i)=='.')
                    nuevo=nuevo+".";
            }//FIN FOR codigo (i)
        System.out.println(nuevo);
    }

}
