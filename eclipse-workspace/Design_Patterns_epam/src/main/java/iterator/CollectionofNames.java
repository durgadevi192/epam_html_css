package iterator;

public class CollectionofNames implements Container{  
public String name[]={"Durga Allu,Hema,Kumari a,Priya Sri"};   
      
    public Iterator getIterator() {  
        return new CollectionofNamesIterate() ;  
    }  
    private class CollectionofNamesIterate implements Iterator{  
        int i;   
        public boolean hasNext() {  
            if (i<name.length){  
                return true;  
            }  
            return false;  
        }    
        public Object next() {  
            if(this.hasNext()){  
                return name[i++];  
            }  
            return null;      
        }  
    }}

