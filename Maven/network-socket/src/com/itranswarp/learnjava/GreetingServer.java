package com.itranswarp.learnjava;

import java.net.*;
import java.nio.charset.StandardCharsets;
import java.io.*;

public class GreetingServer extends Thread {
	private ServerSocket serverSocket;

	public GreetingServer(int port) throws IOException {
		serverSocket = new ServerSocket(port);
		serverSocket.setSoTimeout(10000);
	}

	public void run() {
		while (true) {
			try {
				System.out.println("等待远程连接，端口号为：" + serverSocket.getLocalPort() + "...");
				Socket server = serverSocket.accept();
				System.out.println("远程主机地址：" + server.getRemoteSocketAddress());
				DataInputStream in = new DataInputStream(server.getInputStream());
				System.out.println(in.readUTF());
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				out.writeUTF("谢谢连接我：" + server.getLocalSocketAddress() + "\nGoodbye!");
				server.close();
			} catch (SocketTimeoutException s) {
				System.out.println("Socket timed out!");
				break;
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}
		}
	}

	public static void main(String[] args) {
		int port = Integer.parseInt(args[0]);
		try {
			Thread t = new GreetingServer(port);
			t.run();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Handler extends Thread {
	Socket sock;

	public Handler(Socket sock) {
		this.sock = sock;
	}

	@Override
	public void run() {
		try (InputStream input = this.sock.getInputStream()) {
			try (OutputStream output = this.sock.getOutputStream()) {
				handle(input, output);
			}
		} catch (Exception e) {
			try {
				this.sock.close();
			} catch (IOException ioe) {
			}
			System.out.println("client disconnected.");
		}
	}

	private void handle(InputStream input, OutputStream output) throws IOException {
		var writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));
		var reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
		writer.write("hello\n");
		writer.flush();
		for (;;) {
			String s = reader.readLine();
			if (s.equals("bye")) {
				writer.write("bye\n");
				writer.flush();
				break;
			}
			writer.write("ok: " + s + "\n");
			writer.flush();
		}
	}
}
