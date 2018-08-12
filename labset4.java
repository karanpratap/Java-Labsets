import java.io.*;

class TrunkCall{
    
    public double duration, charge;
    TrunkCall(){
        duration=0;
    }

    TrunkCall(double d){
        duration=d;
    }

    void calcCharge(){
        System.out.println("Error!");
    }

}

class OrdinaryCall extends TrunkCall{
	
	double callRate;
	OrdinaryCall(){
		super();
		callRate=0.60;
	}

	OrdinaryCall(double d){
		super(d);
		callRate=0.60;
	}

	OrdinaryCall(double d,double f){
		super(d);
		callRate=f;
	}
	
	public void calcCharge(){
		charge=duration*callRate;
		System.out.println("Total Charge for Ordinary call:"+charge);
	}

}

class UrgentCall extends TrunkCall{
	
	double callRate;
	UrgentCall(){
		super();
		callRate=1.0;
	}

	UrgentCall(double d){
		super(d);
		callRate=1.0;
	}

	UrgentCall(double d,double f){
		super(d);
		callRate=f;
	}
	
	public void calcCharge(){
		charge=duration*callRate;
		System.out.println("Total charge for Urgent call:"+charge);	
	}
	
}

class LightningCall extends TrunkCall{
	
	double callRate;
	LightningCall(){
		super();
		callRate=1.2;
	}

	LightningCall(double d){
		super(d);
		callRate=1.2;
	}

	LightningCall(double d,double f){
		super(d);
		callRate=f;
	}
	
	public void calcCharge(){
		charge=duration*callRate;
		System.out.println("Total charge for Lightning call:"+charge);
	}	
	
}

class Labset4{
    public static void main(String[] args){
        TrunkCall tref;
        OrdinaryCall oc=new OrdinaryCall();
        UrgentCall uc=new UrgentCall(20);
        LightningCall lc=new LightningCall(20,3);
        tref=oc;
        tref.calcCharge();
        tref=uc;
        tref.calcCharge();
        tref=lc;
        tref.calcCharge();
    }
}
