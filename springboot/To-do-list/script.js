const todoInput=document.querySelector("#task");
const todoList=document.querySelector("#to-do-list");
const form=document.querySelector("#newtask");

const addTo= function(event){
    event.preventDefault();
    const todo=todoInput.value;
    todoList.appendChild(createTodo(todo));
    todoInput.value='';
}

const createTodo=function(todo){
    let todoItem=document.createElement('div');
    let checkbox=document.createElement('input');
    let label=document.createElement('label');
    label.innerText=todo;
    checkbox.type='checkbox';
    checkbox.addEventListener('change',removetoDo);
    todoItem.appendChild(checkbox);
    todoItem.appendChild(label);
    todoItem.classList.add('to-do-item');
    return todoItem;
}

const removetoDo=function(event){
    event.target.parentNode.remove();
}

form.addEventListener('submit',addTo);