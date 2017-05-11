/**
 * 
 */
package com.whu.test;

/**
 * @author hongliang
 *
 */
public class EchoServer {
	
	private final int port;

	/**
	 * @param port
	 */
	public EchoServer(int port) {
		super();
		this.port = port;
	}

	public static void main(String[]args)
	{
		if(args.length==1){
			System.err.println("Usage: "+EchoServer.class.getSigners()+" ");
		}
		
		int port=Integer.parseInt(args[0]);
		new EchoServer(port).start();
		
	}

	/**
	 * 
	 */
	private void start() {
		
		final EchoServerHandler serverHandler=new EchoServerHandler();
		
	//	EventLoopGroup group=new NioEventLoopGroup();
		
		
	}
	
	
	

}
