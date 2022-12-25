package Decorator;

public abstract class ServiceDecorator implements Service {
		private Service wrapee;

		public void ServiceDecorator(Service service) {
			this.wrapee= service;
		}
		
		public void onStartCommand() {
			//do Something
			
		}

}

