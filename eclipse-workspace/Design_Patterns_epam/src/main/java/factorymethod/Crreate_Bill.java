package factorymethod;

abstract class Crreate_Bill {
	double rate;  
    abstract void getRate();  

    double calculateBill(double sqrfoot){  
         return sqrfoot*rate;  
    }
}

