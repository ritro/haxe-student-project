# haxe-student-project

Eclipse plugin for haXe language. Just a student diploma and a test of Eclipse capabilities.

# Инструкция для пользователя - как установить плагин
В eclipse Help->Install New Software->Add ссылка: http://haxe-student-project.googlecode.com/svn/trunk/IDEUpdateSite

# Инструкция для разработчика - как подготовиться к началу работы над плагином
качаем JDK для своей машины\системы тут - http://www.oracle.com/technetwork/java/javase/downloads/index.html
качаем Eclipse (например Eclipse Indigo classic)
запускаем Eclipse и Help->Install New Software-> Вводим ссылку http://download.eclipse.org/technology/imp/updates/ -> Add -> устанавливаем. Если не ставится с первого раза, пробуем ставить какую то часть (их там 3) сначала, и потом остальные
теперь нужно выкачать (если ранее не сделали) репозиторий, ссылка на который была в предыдущем письме
в Eclipse попробовать что то одно из (лучше все же опробовать сначала первый способ):
Import->ExistingProjectIntoWorkspace?
New Java Project -> после создания -> import File system.
опционально: отлично - заходим в src/workspace/elements/HaxeProject? и закоменчиваем строчку linkAll() (данная функция пробегается по всем файлам проекта и пытается связать испльзования с определениями - может быть причиной падений при запуске)
ошибок в проекте не обнаружено? теперь можно создать конфигурацию для запуска (Run-create new configuration - eclipse application - create new), выйти и запустить (RunAs?-наша конфигурация) и опробовать
# Возможные проблемы при запуске
Sanity Checker решение: Project - IMP - снять галочку с Sanity Checker

External Tool Builder решение: Project - properties - builders - удаляем соотвествующую запись из списка
