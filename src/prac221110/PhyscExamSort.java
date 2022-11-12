package prac221110;

import java.util.Arrays;
import java.util.Comparator;


public class PhyscExamSort {

	static class PhyscData{
		
		
		String name;//�̸�
		int height;//Ű
		double vision;//�÷�
		
		public PhyscData(String name, int height, double vision) {
			
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name + " " + height + "  " + vision;
		}
		
		public static final Comparator HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData>{
			@Override
			public int compare(PhyscData d1, PhyscData d2) {
				return  (d1.height > d2.height ) ? 1: (d1.height < d2.height ) ? -1:0;
				//return  (d1.height > d2.height ) ? -1: (d1.height < d2.height ) ? 1:0;
				//251 
			}
		}
		
		public static final Comparator VISION_ORDER = new VisionOrderComparator();
		
		private static class VisionOrderComparator implements Comparator<PhyscData>{
			@Override
			public int compare(PhyscData d1, PhyscData d2) {
				return  (d1.vision > d2.vision ) ? 1: (d1.vision < d2.vision ) ? -1:0;
				//return  (d1.height > d2.height ) ? -1: (d1.height < d2.height ) ? 1:0;
				//251 
			}
		}
		
		public static final Comparator NAME_ORDER = new NameOrderComparator();
		
		private static class NameOrderComparator implements Comparator<PhyscData>{
			@Override
			public int compare(PhyscData d1, PhyscData d2) {
				//return  d1.name.compareTo(d2.name);
				return  d2.name.compareTo(d1.name);
			}
		}
	}
	
	public static void main(String[] args) {
		//1. �迭 �����Ѵ�.
		PhyscData[] x = {
				new PhyscData("������", 162,  0.3), 
				new PhyscData("������", 173,  0.7), 
				new PhyscData("���ؼ�", 175,  2.0), 
				new PhyscData("������", 171,  1.5),
				new PhyscData("�̼���", 168,  0.4), 
				new PhyscData("����", 174,  1.2), 
				new PhyscData("Ȳ����", 169,  0.8) 
		};
		//2. Arrays.sort(��ü)

		//Arrays.sort(x, PhyscData.HEIGHT_ORDER);

		Arrays.sort(x, PhyscData.NAME_ORDER);

	//	Arrays.sort(x, PhyscData.VISION_ORDER);

        System.out.println("�� ��ü�˻� ����Ʈ ��");
        System.out.println("�̸�      Ű      �÷�");
        System.out.println("---------------");
        for(int i=0; i<x.length;i++) {
        	System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height,x[i].vision);
        }
	}

}
