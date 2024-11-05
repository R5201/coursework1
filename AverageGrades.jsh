int[] average_grades(int grades[][], int weights[]){
	double weight=0.0;
	int[] weighted_avg = new int[grades.length];
	for (int k = 0; k<weights.length; k++){
		weight += weights[k];
	}	
	
	for (int i = 0; i<grades.length; i++){
		double avg=0.0;
		for (int j = 0; j<grades[0].length; j++){
			avg += grades[i][j]*weights[j];
		}
		int average = (int)(avg/weight);
		weighted_avg[i]=average;
	}
	return weighted_avg;

}