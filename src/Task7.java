// Task 7
// Существует поддерживаемый API, методы которого не могут быть модифицированы.
// Появилась необходимость выпустить вторую версию со следующими изменениями:
// 1.  GET-метод должен принимать дополнительный ОБЯЗАТЕЛЬНЫЙ параметр notRemoved (boolean)
// 2.  PUT-метод должен содержать ID пользователя в URI
// Как это лучше всего сделать?

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public User getUserById(@PathVariable Long userId) {
        // нормальный рабочий код метода
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void createUser(@RequestBody User user,
                           HttpServletRequest request,
                           HttpServletResponse response) {
        // тут скрыт код без багов
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public User updateUser(@RequestBody User user) {
        // метод работает как надо
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
    public void removeUser(@RequestBody User user,
                           HttpServletResponse response) {
        // тут есть код, который работает
    }
}