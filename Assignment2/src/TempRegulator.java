public interface TempRegulator
{
	void setTemperatureInF(int temp);
	void setTemperatureInC(int temp);
	int getTemperatureInF();
	int getTemperatureInC();
}