
var app = new Vue({
    el: '#app',
    data: {
        message: 'Hello Vue!'
    }
})

var app2=new Vue({

    el:'#app2',
    data:{
        seen:true
    }

});


var student=new Vue({

    el:"#student",
    data:{
        students:''
    },
    created:function () {

        this.fetch();
    },
    methods:{
        fetch:function () {
            var vm=this;
            this.$http.get("http://localhost:8080/students").then(
                function (data) {
                    vm.students=data.body;
                }
            )
            
        }
    }



});