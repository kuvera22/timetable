<#import "parts/common.ftl" as c>

<@c.page>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-8">
                <div class="card">
                    <div class="card-header">Введите кафедру для добавления</div>
                    <div class="card-body">
                        <form name="my-form" method="post" id="my-form" action="${requestcontext.contextPath}/department">
                            <div class="form-group row">
                                <label for="name" class="col-md-4 col-form-label text-md-right">Кафедра</label>
                                <div class="col-md-6">
                                    <input type="text" id="name" class="form-control" name="name">
                                </div>
                            </div>
                            <div class="form-group row" id="subject">
                                <label for="name" class="col-md-4 col-form-label text-md-right">Предмет</label>
                                <div class="col-md-6">
                                    <input type="text" id="name" class="form-control" name="subjectName">
                                </div>
                            </div>
                            <div class="form-group row" id="but">
                                <div class="mx-auto">
                                    <button onclick="addSubject()" type="button" class="btn btn-info btn-sm">
                                        Ещё предмет
                                    </button>
                                </div>
                            </div>

                            <div class="col-md-6 offset-md-4">
                                <button type="submit" class="btn btn-primary">
                                    Добавить
                                </button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script>
        var yourGlobalVariable = 0;
        function addSubject() {
            yourGlobalVariable++;
            var count = yourGlobalVariable;
            count--;
            console.log(yourGlobalVariable);
            var id = "subject" + yourGlobalVariable;
            let str = "subject" + count;
            let mydiv = document.createElement('div');
            // mydiv.className = "reg";
            mydiv.classList.add("form-group", "row");
            mydiv.id = id;
            var s = '<div class="form-group row"' + 'id="' + id + '">';
            mydiv.innerHTML =
                '<label for="name" class="col-md-4 col-form-label text-md-right">Предмет</label>' +
                '<div class="col-md-6">' +
                '<input type="text" id="name" class="form-control" name="subjectName">' +
                '</div>' +
                '</div>';
            console.log(mydiv);
            if (yourGlobalVariable === 1) {
                document.getElementById("subject").insertAdjacentElement("afterend", mydiv);
            } else {
                console.log(document.getElementById(str));
                console.log(str);
                document.getElementById(str).insertAdjacentElement("afterend", mydiv);
            }
        }
    </script>

</@c.page>