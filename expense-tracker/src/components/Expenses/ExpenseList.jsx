import ExpenseItem from "./ExpenseItem";

const ExpenseList = ({ items }) => {
    if(items.length == 0) return <h2 className = "text-2xl text-slate-100 font-bold">No Expenses Found</h2>;
    return (
        <div className = "w-full mx-auto bg-slate-200">
            {items.map((expense) => (
                <ExpenseItem
                    key = {expense.id}
                    title = {expense.title}
                    amount = {expense.amount}
                    date = {expense.date}
                />
            ))}
        </div>
    );
};

export default ExpenseList;