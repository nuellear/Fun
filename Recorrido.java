/**
 *
 * @author Emmanuel Salvador Leal Rangel
 */
public class Recorrido {
    
    public static void main(String[] args) {
        String codigo="Ynkxquip Nuqrky, wak ks as vxñsiñvñu Jueqk zksñg vxkbñyzu qqgrgx \n" 
                +"Ynkxxñsluxj, ky as jkzkizñbk vxñbgju, gqzu, jkqmgju, lxñu, ñxusñiu, \n" 
                +"ñsmksñuyu k ñszkqkizagqrkszk ñswañkzu. Cgzyus qu jkyixñhk lñyñigrkszk \n" 
                +"jkq yñmañkszk ruju gq vuiu jk iusuikxyk. "
                +"Ya kyzgzaxg yuhxkvgyghg quy ykñy vñky, e kxg zgs kdzxguxjñsgxñgrkszk \n" 
                +"ksoazu, wak vxujaiñg qg ñrvxkyñus jk ykx gas rgy gqzu. Zksñg qg rñxgjg \n" 
                +"gmajg e vkskzxgszk, e ya sgxñf, lñsg e gmañqktg, jghg gq iusoaszu jk yay \n" 
                +"lgiiñusky as gñxk jk bñbkfg e jk xkyuqaiñus. "
                +"Gaswak rainuy ngs skmgju kyzg uviñus, kq kyixñzux hgyu ya jkyixñviñus \n" 
                +"jk nuqrky ks as gszñmau grñmu jk qg lgiaqzgj, qqgrgju Ynkxxñsluxj, kq \n" 
                +"iagq qqkmu g luxrgx vgxzk jk Yiuzqgsj Egxj, mxgs grñmu e gqñgju jk iusgs \n" 
                +"jueqk e iaegy jkyixñviñusky jk bñbksiñgy vuqñiñgigy ñsyvñxgxus raingy jk \n" 
                +"yay uhxgy.";
        String abc="abcdefghijklmnñopqrstuvwxyz";
        String abc2="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String nuevo="";
          
        for(int i=0;i<codigo.length();i++){
                for(int j=0; j<abc.length(); j++){
                    if(codigo.charAt(i)==abc2.charAt(j)){
                        int aux=j-6;
                        if(aux<0)
                          aux=aux+27;   
                        nuevo=nuevo+abc2.charAt(aux);
                    }else if(codigo.charAt(i)==abc.charAt(j)){
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
