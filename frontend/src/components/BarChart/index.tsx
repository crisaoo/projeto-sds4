import Chart from 'react-apexcharts';

function BarChart(){
  const options = {
    plotOptions: {
      bar: {
        horizontal: true
      }
    }
  }

  const mockData = {
    labels: {
      categories: ['A', 'B', 'C', 'D', 'E']
    },
    series: [
      {
        name: "% Sucesso",
        data: [53.5, 54.7, 32.89, 48.5, 43]
      }
    ]
  };

  return (
    <Chart
      options={{...options, xaxis: mockData.labels}}
      series={mockData.series}
      type="bar"
      height="240"
    />
  );
}

export default BarChart;