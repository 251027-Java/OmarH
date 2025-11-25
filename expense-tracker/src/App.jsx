import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import ExpenseList from './components/Expenses/ExpenseList'
import ExpenseForm from './components/ExpenseForm'
import ExpenseFilter from './components/Expenses/ExpenseFilter'



const Dummy_Expenses = [
  {
      id: "e1",
      title: "Expense1",
      amount: 123,
      date: new Date(2023, 1, 1),
    },
    {
      id: "e2",
      title: "Expense2",
      amount: 345,
      date: new Date(2023, 0, 1),
    },
    {
      id: "e3",
      title: "Expense3",
      amount: 456,
      date: new Date(2023, 3, 1),
    },
    {
      id: "e4",
      title: "Expense4",
      amount: 789,
      date: new Date(2023, 5, 1),
    },
  ];

function App() {
  const [expenses, setExpenses] = useState(Dummy_Expenses);
  const[filteredYear, setFilteredYear] = useState('2023');


  const addExpenseHandler = (expense) => {
    const expenseWithId = {...expense, id: Math.random().toString()}

    setExpenses((prevExpenses) => {
      return [...prevExpenses, expenseWithId]// ... is the spread operator to copy the array and add the new expense to it
      return [expenseWithId, prevExpenses]
    
    });
  };

  const filteredExpenses = expenses.filter((expense) => {
    return expense.date.getFullYear().toString() === filteredYear;
  });

  const filterChangeHandler = (selectedYear) => {
    setFilteredYear(selectedYear);
  };

  return (
    <div className = "min-g-screen bg-slate-900 px-4 font-sans">
      <h1 className = "text-3xl py-4 text-slate-100 font-bold">Testing 123</h1>
      <ExpenseForm onSaveExpenseData = {addExpenseHandler}/>
      <ExpenseFilter onChangeFilter = {filterChangeHandler}
      selected = {filteredYear}/>
      <ExpenseList items={filteredExpenses}/>
    </div>
  );
};

export default App
