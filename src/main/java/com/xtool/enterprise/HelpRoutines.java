package com.xtool.enterprise;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class HelpRoutines {
	
	public static final byte[] toAsciiBytes(String source) {
		if(source==null || "".equals(source))return new byte[0];
		try {
			return source.getBytes("ASCII");
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}
	
	public static final byte[] toUtf8Bytes(String source) {
		if(source==null || "".equals(source))return new byte[0];
		try {
			return source.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}
	
	public static final String fromAsciiBytes(byte[] source) {
		if(source==null || source.length==0)return "";
		try {
			return new String(source, "ASCII");
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}
	public static final String fromUtf8Bytes(byte[] source) {
		if(source==null || source.length==0)return "";
		try {
			return new String(source, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}
	
	public static final String toBase64(byte[] source) {
		if(source==null || source.length==0)return null;
		return Base64.getEncoder().encodeToString(source);
	}
	public static final byte[] fromBase64(String source) {
		if(source==null || "".equals(source))return new byte[0];
		return Base64.getDecoder().decode(source);
	}
}
