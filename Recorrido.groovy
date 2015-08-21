def abc = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"]
def abc2 = ["A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"]
def code="Ynkxquip Nuqrky, wak ks as vxñsiñvñu Jueqk zksñg vxkbñyzu qqgrgx."
int aux=0;

    for (obj in code){
        for(item in abc){
            if(obj.equals(item)){
                print abc.getAt(aux-6)
                //println aux
            }
            if(obj.equals(abc2.getAt(aux))){
                print abc2.getAt(aux-6)
                //println aux
            }
            aux+=1
            if(aux==27)
                aux=0
        }
        if(obj.equals(" "))
            print " "
        if(obj.equals(","))
            print ","
        if(obj.equals("."))
            print "."
     }
