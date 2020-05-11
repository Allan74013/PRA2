package com.example.agendiario;	

	import  androidx.annotation.NonNull ;
	import  androidx.annotation.Nullable ;
	import  androidx.room.ColumnInfo ;
	import  androidx.room.Entity ;
	import  androidx.room.PrimaryKey ;
	

	@Entity (tableName  =  "Payments")
	
	public  class  Payments{
	
	    @PrimaryKey ( autoGenerate  =  true )
	    @NonNull
	    @ColumnInfo ( name  =  " paymentsId " )
	    private  int mId;
	
	    @Nullable
	    @ColumnInfo ( name  =  " paymentsDescription " )
	    private  String mDescription;
	
	    private  String mPlace;
	
	     Payments public ( @Nullable  String description, String place, Double amount , String  creationDate ) {
	        mDescription = descrição;
	        mPlace = local;
	        mAmount = valorPago ;
	        mCreationDate = creationDate;
	    }
	

	    public  int  getId () {
	        return mID;
	    }
	

	    public  void  setId (@NonNull int  id ) {
	        mId = id;
	    }
	

	    public  String  getDescription () {
	        return mDescription;
	    }
	

	    public  void  setDescription (String description) {
	        mDescription = descrição;
	    }
	

	    public  String  getPlace () {
	        return mPlace;
	    }
	

	    public  void  setPlace (String place) {
	        mPlace = local;
	    }
	
	    public  Double  getAmount () {
	        return mAmount;
	    }
	
	    public  void  setAmount ( Double  Amount) {
	        mAmount = valor;
	    }
	

	    public  String  getCreationDate () {
	        return mCreationDate;
	    }
	

	    public  void  setCreationDate ( String  creationDate) {
	        mCreationDate = creationDate;
	    }
	
	    private  Double mAmount;
	    private  String mCreationDate;
	
	}
