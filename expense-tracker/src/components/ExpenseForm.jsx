import {useState} from "react";




const ExpenseForm = (prop) => {
    //we want to accept a new expense from the user
    //with a title, amount and date
    // and add it to the list(create a new id/key for it)

    const[enteredTitle, setEnteredTitle] = useState('');
    const[enteredAmount, setEnteredAmount] = useState('');
    const[enteredDate, setEnteredDate] = useState('');

    const titleChangeHandler = (event) => {
        setEnteredTitle(event.target.value);
    };
    const amountChangeHandler = (event) => {
        setEnteredAmount(event.target.value);
    };
    const dateChangeHandler = (event) => {
        setEnteredDate(event.target.value);
    };
    const submitHandler = (event) => {
        event.preventDefault();
        const expenseData = {
            title: enteredTitle,
            amount: enteredAmount,
            date: new Date(enteredDate)
        };
        console.log(expenseData);
        prop.onSaveExpenseData(expenseData);
    };

    return(
        <div className = " w-full mx-auto max-w-2xl bg-indigo-600 p-6 rounded-xl text-white shadow-lg">
            <h3 className = "text-white font-bold text-lg">Add New Expense</h3>
            <form onSubmit = {submitHandler} >
                <div className = "grid grid-cols-2 gap-4 mb-4"/>
                    <div className ="col-span-2 gap-4 mb-4"/>
                <label className = "block text-indigo-100 text-sm font bold">Title</label>
                <input
                    type = "text"
                    value = {enteredTitle}
                    onChange = {titleChangeHandler}
                    placeholder = "e.g. Fuel"
                    className = "w-full bg-white rounded-1g text-slate-800 focus:outline-none focus:ring-2 focus:ring-indigo-300"
                    required
                />
                <div className = "col-span-1">
               <label className = "block text-indigo-100 text-sm font bold">Amount</label>
               <input
                    type = "number"
                    min = "0.01"
                    step = "0.01"
                    value = {enteredAmount}
                    onChange = {amountChangeHandler}
                    className = "w-full bg-white rounded-1g text-slate-800 focus:outline-none focus:ring-2 focus:ring-indigo-300"
                    placeholder = "0.00"
                    required 
               />
               </div>
               

                <div className = "text-right">
               <label className = "block text-indigo-100 text-sm font bold">Date</label>
               <input 
                    type = "date"
                    min = "2019-01-01"
                    max = "2035-12-31"
                    value = {enteredDate}
                    onChange = {dateChangeHandler}
                    className = "w-full bg-white rounded-1g text-slate-800 focus:outline-none focus:ring-2 focus:ring-indigo-300"
                    required
               />
               </div> 

               <button 
               type = "submit"
               className= "bg-indigo-900 text-white font-bold rounded-1g py-2 px-6 border-indigo-700 hover:bg-indigo-800 hover:border-indigo-800">Add Expense</button>
            </form>
        </div>

    )
}

export default ExpenseForm;