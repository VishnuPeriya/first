package com.nadl.fiu.dto;

public class KeyMaterial {

	private String cryptoAlg;


	private String curve;


	private String params;

	
	private DHPublicKey dhPublicKey;


	private String nonce;


	private String signature;

	public KeyMaterial() {
		super();
	}

	public KeyMaterial(String cryptoAlg, String curve, String params) {
		super();
		this.cryptoAlg = cryptoAlg;
		this.curve = curve;
		this.params = params;
	}

	public String getCryptoAlg() {
		return cryptoAlg;
	}

	public void setCryptoAlg(String cryptoAlg) {
		this.cryptoAlg = cryptoAlg;
	}

	public String getCurve() {
		return curve;
	}

	public void setCurve(String curve) {
		this.curve = curve;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public DHPublicKey getDhPublicKey() {
		return dhPublicKey;
	}

	public void setDhPublicKey(DHPublicKey dhPublicKey) {
		this.dhPublicKey = dhPublicKey;
	}

	public String getNonce() {
		return nonce;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

}
