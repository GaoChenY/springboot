package com.how2java.springboot.util;

public class ByteUtil {
	private static char[] hex_chars = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	public static byte[] int2Byte(int a) {
		byte[] b = new byte[4];
		b[0] = (byte) (a >> 24);
		b[1] = (byte) (a >> 16);
		b[2] = (byte) (a >> 8);
		b[3] = (byte) (a);

		return b;
	}

	public static void int2bytes_le(byte[] packet, int value, int p)
	{
		packet[p] = (byte)(value & 0xff);
		packet[p+1] = (byte)((value>>> 8) & 0xff);
		packet[p+2] = (byte)((value>>> 16) & 0xff);
		packet[p+3] = (byte)((value>>> 24) & 0xff);
	}
	
	public static void short2bytes_le(byte[] packet, int value, int p)
	{
		packet[p] = (byte)(value & 0xff);
		packet[p+1] = (byte)((value>>> 8) & 0xff);
	}

	public static int byte2int_le(byte[] bt, int pos)
	{
		int size = (int)(bt[pos] & 0xff);
		size |= ((((int)bt[pos + 1]) & 0xff) << 8);
		size |= ((((int)bt[pos + 2]) & 0xff) << 16);
		size |= ((((int)bt[pos + 3]) & 0xff) << 24);

		return size;
	}
	
	public static short byte2short_le(byte[] bt, int pos)
	{
		short size = (short)(bt[pos] & 0xff);
		size |= (((int)bt[pos + 1]) << 8);		
		
		return size;
	}
	
	public static int byte2int24_le(byte[] bt, int pos)
	{
		int size = (int)(bt[pos] & 0xff);
		size |= ((((int)bt[pos + 1]) & 0xff) << 8);
		size |= ((((int)bt[pos + 2]) & 0xff) << 16);		
		return size;
	}
	
	public static int onebyte2int(byte[] b, int off)
	{
		return (0xFF & b[off]);
	}

    public static short getShort(byte[] bytes) {
        return (short) ((0xff & bytes[0]) | (0xff00 & (bytes[1] << 8)));
    }
	/**
	 * transfer one int into one byte
	 * @param n : source integer
	 * @param b : destination byte array
	 * @param off : the position of operating byte 
	 * @throws Exception
	 */
	public static void int2onebyte(int n, byte[] b, int off) throws Exception
	{
		if(!(n>=0 && n<=255)) throw new Exception(n+" exceed unsigned char range [0,255]!");
		b[off] = 0x00;
		b[off] |= n;
	}
	
	/**
	 * transfer two bytes into one int
	 * @param b : source byte array
	 * @param off : the position of operating byte 
	 * @return
	 */
	public static int twobyte2int(byte[] b, int off)
	{
		int n = 0;
		n |= ( 0xFF & b[off] ) << 8;
		n |= ( 0xFF & b[off+1] );
		return n;
	}
	
	/**
	 * transfer one int into two bytes
	 * @param n : source integer
	 * @param b : destination byte array
	 * @param off : the position of operating byte 
	 * @throws Exception
	 */
	public static void int2twobyte(int n, byte[] b, int off) throws Exception
	{
		if(!(n>=0 && n<=65535)) throw new Exception(n+" exceed unsigned short int range [0,65535]!");
		b[off]   = 0x00;
		b[off+1] = 0x00;
		b[off]   |= (n >> 8);
		b[off+1] |= n;
	}
	
	
	public static String byte2hex(byte[] byte_array)
	{
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<byte_array.length; ++i)
		{
			byte temp = byte_array[i];
			sb.append( hex_chars[ temp>>>4 & 0X0F ] );
			sb.append( hex_chars[ temp & 0X0F ] );
		}
		return sb.toString();
	}
	
	public static void  main(String[] org){
		int n = 0;
		n |= ( 0xFF &0xe9 ) << 8;
		n |= ( 0xFF &0x03 );
		System.out.println("n is "+n);
	}
	
	/**
	 * bytes转换成十进制字符串
	 */
	public static String byte2DecimalStr(byte[] b) {
		StringBuffer hs = new StringBuffer();
		for (int n = 0; n < b.length; n++) {
			int i = b[n];
			if (i < 10){
				hs = hs.append("0").append(i);
			}else{
				hs = hs.append(i);
			}
			if (n<b.length-1) hs = hs.append(",");
		}
		return hs.toString();
	}


	/**
	 * 将short转成byte[2]
	 * @param a
	 * @return
	 */
	public static byte[] short2Byte(short a){
		byte[] b = new byte[2];

		b[0] = (byte) (a >> 8);
		b[1] = (byte) (a);

		return b;
	}

	/**
	 * 将short转成byte[2]
	 * @param a
	 * @param b
	 * @param offset b中的偏移量
	 */
	public static void short2Byte(short a, byte[] b, int offset){
		b[offset] = (byte) (a >> 8);
		b[offset+1] = (byte) (a);
	}

    public static int getInt(byte[] bytes) {
        return (0xff & bytes[0]) | (0xff00 & (bytes[1] << 8)) | (0xff0000 & (bytes[2] << 16)) | (0xff000000 & (bytes[3] << 24));
    }
	/**
	 * 将byte[2]转换成short
	 * @param b
	 * @return
	 */
	public static short byte2Short(byte[] b){
		return (short) (((b[0] & 0xff) << 8) | (b[1] & 0xff));
	}


	/**
	 * 将byte[2]转换成short
	 * @param b
	 * @param offset
	 * @return
	 */
	public static short byte2Short(byte[] b, int offset){
		return (short) (((b[offset] & 0xff) << 8) | (b[offset+1] & 0xff));
	}

	/**
	 * long转byte[8]
	 *
	 * @param a
	 * @param b
	 * @param offset
	 *            b的偏移量
	 */
	public static void long2Byte(long a, byte[] b, int offset) {
		b[offset + 0] = (byte) (a >> 56);
		b[offset + 1] = (byte) (a >> 48);
		b[offset + 2] = (byte) (a >> 40);
		b[offset + 3] = (byte) (a >> 32);

		b[offset + 4] = (byte) (a >> 24);
		b[offset + 5] = (byte) (a >> 16);
		b[offset + 6] = (byte) (a >> 8);
		b[offset + 7] = (byte) (a);
	}

	/**
	 * byte[8]转long
	 *
	 * @param b
	 * @param offset
	 *            b的偏移量
	 * @return
	 */
	public static long byte2Long(byte[] b, int offset) {
		return ((((long) b[offset + 0] & 0xff) << 56)
				| (((long) b[offset + 1] & 0xff) << 48)
				| (((long) b[offset + 2] & 0xff) << 40)
				| (((long) b[offset + 3] & 0xff) << 32)

				| (((long) b[offset + 4] & 0xff) << 24)
				| (((long) b[offset + 5] & 0xff) << 16)
				| (((long) b[offset + 6] & 0xff) << 8)
				| (((long) b[offset + 7] & 0xff) << 0));
	}

	/**
	 * byte[8]转long
	 *
	 * @param b
	 * @return
	 */
	public static long byte2Long(byte[] b) {
		return
				((b[0]&0xff)<<56)|
						((b[1]&0xff)<<48)|
						((b[2]&0xff)<<40)|
						((b[3]&0xff)<<32)|

						((b[4]&0xff)<<24)|
						((b[5]&0xff)<<16)|
						((b[6]&0xff)<<8)|
						(b[7]&0xff);
	}

	/**
	 * long转byte[8]
	 *
	 * @param a
	 * @return
	 */
	public static byte[] long2Byte(long a) {
		byte[] b = new byte[4 * 2];

		b[0] = (byte) (a >> 56);
		b[1] = (byte) (a >> 48);
		b[2] = (byte) (a >> 40);
		b[3] = (byte) (a >> 32);

		b[4] = (byte) (a >> 24);
		b[5] = (byte) (a >> 16);
		b[6] = (byte) (a >> 8);
		b[7] = (byte) (a >> 0);

		return b;
	}

	/**
	 * byte数组转int
	 *
	 * @param b
	 * @return
	 */
	public static int byte2Int(byte[] b) {
		return ((b[0] & 0xff) << 24) | ((b[1] & 0xff) << 16)
				| ((b[2] & 0xff) << 8) | (b[3] & 0xff);
	}

	/**
	 * byte数组转int
	 *
	 * @param b
	 * @param offset
	 * @return
	 */
	public static int byte2Int(byte[] b, int offset) {
		return ((b[offset++] & 0xff) << 24) | ((b[offset++] & 0xff) << 16)
				| ((b[offset++] & 0xff) << 8) | (b[offset++] & 0xff);
	}



	/**
	 * int转byte数组
	 *
	 * @param a
	 * @param b
	 * @param offset
	 * @return
	 */
	public static void int2Byte(int a, byte[] b, int offset) {
		b[offset++] = (byte) (a >> 24);
		b[offset++] = (byte) (a >> 16);
		b[offset++] = (byte) (a >> 8);
		b[offset++] = (byte) (a);
	}
}
