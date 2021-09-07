import Chart from 'react-apexcharts'

function DonutChart(){
  const options = {
    legend: {
      show: true
    }
  }

  const mockData = {
    labels: ['A', 'B', 'C', 'D', 'E'],
    series: [49555, 52146, 27111, 35689, 40750]
  }

  return(
    <Chart
      options={{...options, labels: mockData.labels}}
      series={mockData.series}
      type="donut"
      height="240"
    />
  );
}

export default DonutChart;