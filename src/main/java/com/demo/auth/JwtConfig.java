package com.demo.auth;

public class JwtConfig {  
	
	public static final String RSA_PRIVADA= "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEogIBAAKCAQEAuxe9phk284jHTCX6s9yK1EEch6WuuEVadAKCFbWI7DblAA7g\r\n" + 
			"/IgVD3f0qNmpRHqyaMjTwgOCc1sH3GW5D99g6qmlpTVWn3ig9VeAhtG7j2Upqcx8\r\n" + 
			"1kFPUkNGzyMbAbV+iCw5PJovNIRv1/+fgU6EBCW+VGsWjYVj3doc7uZOOSCxOBGL\r\n" + 
			"rJoTV7m5M5RavCgjbq5PnZG4Gg3p7PYzy6B+57Zihtn494FLu6i5Dlo03WSTvNYm\r\n" + 
			"lMtGJEDBtX3R77ltYgCgIsqOu8MxXph0KsuoQCOiS5/TK+fXef4EIeDyUZ/oQsJa\r\n" + 
			"OMO9pmYPWGzi2AbJazK2f1yEjO7fzhppl566LQIDAQABAoIBADke+XcB0cYu53I3\r\n" + 
			"UkChv/0n1/cOPbbi7cfnkCHip+g+plILOOPBBHURkbAPrF9M+rWFQynD+osPqum+\r\n" + 
			"YO8YqzVaEEnNbCIKKVJeoc4HsLUKFNtTpHWhwP8DrVXGiRNPf09B+UOoa2skWCVh\r\n" + 
			"VSiceS/u+ho6C8uvgxsT4auKwy0raW0qzRJfhYwGJOMOObeH+587U6N3NfzyBUR6\r\n" + 
			"b+W2ni/0oj3MEBQrU4gEb7yjdlPEXb3PzmxR/Vby1r6mXDwbAtH8TE8UTVx8v5tv\r\n" + 
			"iXLxjnjGETA3gMzoeoz2154jeJoPXUS4EI0WJy7KoVFf0OOryXhadb2R7lCsNTOE\r\n" + 
			"0h8CmAECgYEA2yynf9fzzRZvIqfSILcOJFwGeBRtlJX8f2dkK0VaJdVM8B4CJe+3\r\n" + 
			"h0teLysNofHLNMIVtkaWJwC2JUIFpqOZ2DwoRebH9A65c0fdhDqBJTK8pgJtIl9V\r\n" + 
			"HTmAH2eMr4zwMfaxG8kWyWbeTBNBt9bv8cuy9xG1gltxR2lZ+L15wC0CgYEA2oco\r\n" + 
			"QVI3qAwYy0S5P3x2fy3K+gGMudIWU4y56Hxdjta6ovvYUyyxwaHeiGPXH4n1FiB2\r\n" + 
			"Tkv53PE05MVJiRyQY/DzxEs6PaBH4gnLHFQZUBAlal0sfDWiyo8U71Jcq4IKpj1C\r\n" + 
			"mcJ1SGwVD50GZNqEy1As9HxU4kBMtckSM117IgECgYBhhBm2ePgBjPS/n5mPcsL5\r\n" + 
			"DHTYYoZq8NzaNr9LvVyhrqi/wSpFhMXMjY0HQYmcPz+hZqVQZ1GRYvCn3Rs0jF/7\r\n" + 
			"5LAqgcb/YLnEf/ogRgOF8HAdEMFL5Myy5w2Ja4Id7YBFSrR8X1kjHQDVKlA4Ioq5\r\n" + 
			"s18aLKfsqxDYrBga4vrTtQKBgA+jcHwMODNsejHBv0gNziUXz9jIV5vMrxBXl85N\r\n" + 
			"aByavUyAnWCGaEolHVnBW1nEc6ebtxuvUDhBgrmEbNjFFIgybB92CrryR3KjpMdo\r\n" + 
			"NU+HeEX+WPqik/3O836U9FDJw51V8Pgz9FS0d2VgpV5+TNaH7E+qviBa3aJ8uzK1\r\n" + 
			"0+QBAoGAb3Apj3/e4rwqwdTO+BWOZG7Ao7Pvwl1kDVb0qqT+nP4+FaBIavFQY/pb\r\n" + 
			"lOksk03RBEaU4i8OxEV2+c+lO+UqWYvRt2yFhaoN4Dj3rOzLwZaTd/6y/nz5Cafd\r\n" + 
			"y62b/U6LVKoppAwrEctDn0josjvByPx7u2tMtRtA9ssrp2K9MqQ=\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	
	public static final String RSA_PUBLICA="-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuxe9phk284jHTCX6s9yK\r\n" + 
			"1EEch6WuuEVadAKCFbWI7DblAA7g/IgVD3f0qNmpRHqyaMjTwgOCc1sH3GW5D99g\r\n" + 
			"6qmlpTVWn3ig9VeAhtG7j2Upqcx81kFPUkNGzyMbAbV+iCw5PJovNIRv1/+fgU6E\r\n" + 
			"BCW+VGsWjYVj3doc7uZOOSCxOBGLrJoTV7m5M5RavCgjbq5PnZG4Gg3p7PYzy6B+\r\n" + 
			"57Zihtn494FLu6i5Dlo03WSTvNYmlMtGJEDBtX3R77ltYgCgIsqOu8MxXph0Ksuo\r\n" + 
			"QCOiS5/TK+fXef4EIeDyUZ/oQsJaOMO9pmYPWGzi2AbJazK2f1yEjO7fzhppl566\r\n" + 
			"LQIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";

}
