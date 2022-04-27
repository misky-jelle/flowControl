fun main(){
    oddNums(3)
    println(printNames(arrayOf("Lona","Christabel","Misky","Sakins","Bakhita","")))
    printDrinks(4)
    printDrinks(12)
    printDrinks(23)
    numbers()
}
fun oddNums(num:Int){
    for(i in 0..100){
        if((i % 2)!=0)
       println(i)
        }
}
fun printNames(names:Array<String>):Int{
    var name=0
    names.forEach { nam->
        if (nam.length>5){
            name++
        }
    }
            return name
    }
fun printDrinks(age:Int){
    if(age<6){
        println("Take this glass of Milk")
    }
    else if(age>6 && age <15){
        println("Take this Fanta orange drink")
    }
    else{
        println("Take this coke bottle")
    }
}
fun numbers() {
    for (num in 1..100)
        if (num%3==0 && num%5==0){
            println("Fizz Buzz")
        }
        else if ((num%5)==0){
            println("Buzz")
        }
        else if
            ((num%3)==0){
                println("Fizz")
            }
            else {
                println(num)
            }
        }













