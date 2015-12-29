package testgrails

class TestController {

    static defaultAction = "home"
    static var

    def index() { }

    def editSubject() {
        def var1 = "AppleBeingEdited"
        def var2 = "Apple2Y"
        render(template: "part", model:[name: var1, editingTest: true])
//        render(template: "part2", model:[name2:var2, editingTest: true])
        return [editingTest: true, name: var1, name2: var2]
    }


    def saveSubject() {
        def var1 = "AppleSaved"
        render(template: "part", model: [name: var1, editingTest: false])
//        render(template: "part2", model:[name2:'Apple2', editingTest: false])
        return [editingTest: false]
    }
    def home() {
//        render(template: "part", model:[name:''])
//        render(template: "part2", model:[name2:''])
        return [editingTest: true]
    }

    def editSubject2(String firstName) {
//        render { p(firstName)}
        render(template: "part2", model: [firstName: firstName, editingTest: true])
        return [editingTest: true]
    }

    def saveSubject2(String firstName) {
//        render { p(firstName)}
        render(template: "part2", model: [firstName: firstName, editingTest: false])
        return [editingTest: false]
    }

    def home2() {
        return [editingTest: true]
    }
}
