package prac221106;

import com.sun.jdi.VMOutOfMemoryException;

import java.awt.color.ColorSpace;

public class ExceptionAll {
    public static void main(String[] args) {

        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e){
            System.out.println("에러메세지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보 후 설치하세요");
        } catch (MemoryException me)    {
            System.out.println("에러메세지 : "+ me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("재설치하세요");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace())
            throw new SpaceException("설치 공간 부족");
        if (!enoughMemory())
            throw new MemoryException("메모리 부족");
    }

    static void copyFiles() {/*파일 복사 코드*/}
    static void deleteTempFiles(){/*임시파일 삭제 코드*/}

    static boolean enoughSpace(){//설치 공간 있는지 확인하는 코드
        return false;
    }

    static boolean enoughMemory(){//설치 메모리 있는지 확인하는 코드
        return true;
    }
}

class SpaceException extends Exception{
    SpaceException(String msg)  {
        super(msg);
    }
}

class MemoryException extends Exception{
    MemoryException(String msg){
        super(msg);
    }
}