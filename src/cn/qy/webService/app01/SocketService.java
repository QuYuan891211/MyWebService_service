package cn.qy.webService.app01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketService {

    public String toUpCase(String data){
        return data.toUpperCase();
    }
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8888);

            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte[4];
            int len = 0;
            String data = " ";
            System.out.println("当前len:"+len);
            while ((len = inputStream.read(buffer) ) != -1){
                System.out.println("当前len:"+len);
                data+=(new String(buffer,0,len));
                System.out.println("当前从客户端获取的数据:"+data);
                System.out.println("当前len:"+len);
            }

            //获取最后一次的数据
            System.out.println("从客户端获取的全部数据:"+data);
            SocketService socketService = new SocketService();
            String sendData = socketService.toUpCase(data);

            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(sendData.getBytes("UTF-8"));
            outputStream.close();
            inputStream.close();
            socket.close();
        }

}
