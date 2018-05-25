package com.testARQ;

import java.util.Random;

public class ARQ {
	private int Nmax;
	private int N; //窗口宽度
	private int P; //误帧率
	
	
	
	private int getRandom(int seed){
		 Random random= new Random(seed);
		 return random.nextInt();
	}
	
	//发送进程
	private  void send(){
		int[] frm = new int[Nmax];
		int sn,rn;
		int num=0;
		int i,rd;
		int atob,btoa;
		Msg ms = new Msg();
		//atob
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getNmax() {
		return Nmax;
	}
	public void setNmax(int nmax) {
		Nmax = nmax;
	}
	public int getN() {
		return N;
	}
	public void setN(int n) {
		N = n;
	}
	public int getP() {
		return P;
	}
	public void setP(int p) {
		P = p;
	}
	
}
