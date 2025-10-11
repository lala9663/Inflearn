import { Component } from 'react'
import './App.css'

export default class App extends Component{

  btnStyle = {
    color: '#fff',
    border: 'none',
    padding: '5px 10px',
    borderRadius: '50%',
    cursor: 'pointer',
    float: 'right'
  }

  getStyle = () => {
    return {
      padding: '10px',
      borderBottom: '1px #ccc dotted',
      textDecoration: 'none' // 할 일 완료시 줄 긋기 효과 제거
    }
  }

  todoData = [
    {
      id: 1,
    title: '공부하기',
    completed: true,
    },
    {
      id: 2,
      title: '청소하기',
      completed: false
    }
    ]

  render() {
    return (
      <div className='container'>
        <div className='todoBlock'>
          <div className='title'>
            <h1>할 일 목록</h1>
          </div>

          {
            this.todoData.map((data) => (
              <div key={data.id} style={this.getStyle()}>
                <input type='checkbox' defaultChecked={false} />
                {data.title }
                <button style={this.btnStyle}>X</button>
              </div>
            ))
          }
          
        </div>
      </div>
    )
  }  
}