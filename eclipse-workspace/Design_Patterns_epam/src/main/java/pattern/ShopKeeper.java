package pattern;

public class ShopKeeper {  
    private MobileShop iphone;  
    private MobileShop oopo;  
    private MobileShop realme;  
      
    public ShopKeeper(){  
        iphone= (MobileShop) new Iphone();  
        oopo=new Oopo();  
        realme=new RealMe();  
    }  
    public void iphoneSale(){  
        iphone.modelNo();  
        iphone.price();  
    }  
        public void oopoSale(){  
        oopo.modelNo();  
        oopo.price();  
    }  
   public void realmeSale(){  
    realme.modelNo();  
    realme.price();  
        }  
} 