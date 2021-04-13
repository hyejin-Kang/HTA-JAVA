package day3.abstraction;

public class Reporter {

		//Chart �߻�Ŭ������ ������ �پ��� ��Ʈ��ü�� ������ ��������
		private Chart chart;
		
		//Chart �߻�Ŭ������ ������ �پ��� ��Ʈ��ü�� �ּҰ��� ���޹޴� setter �޼ҵ�
		public void setChart(Chart chart) {
			this.chart = chart;
		}
		
		public void createReport()
		{
			System.out.println(chart.getTitle());
			//�������� �����Ǵ� ��
			//chart ���������� �����ϴ� ��ü�� ���������� �����ǵ� draw() �޼ҵ尡 ����ȴ�.
			
			chart.draw();
		}
}