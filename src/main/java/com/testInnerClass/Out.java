package com.testInnerClass;

public class Out {
	private int a ;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	class Inner{
		private int innera;
		public int getouta(){
			return a;
		}
		public int getInnera() {
			return innera;
		}

		public void setInnera(int innera) {
			this.innera = innera;
		}
		
	}
	
	public static void main(String[] args) {
		Out out = new Out();
		out.setA(5);
		Out.Inner inner1 = out.new Inner();
		Out.Inner inner2 = out.new Inner();
		out=null;
		//System.out.println(out.getA());
		System.out.println(inner1.getouta());
	}
}
