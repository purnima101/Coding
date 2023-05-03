class Superhero{
    constructor(name,age){
        this.name=name
        this.age=age
    }

    getPowers(){
        if(this.age<30){
            return("avenegrs")
        }
        else{
            return("Justice Leage")
        }
    }
}

module.exports=Superhero

// console.log(batman.getPowers())