<#import "parts/common.ftl" as c>

<@c.page>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-8">
                <div class="card">
                    <div class="card-header">Введите данные для добавления преподавателя</div>
                    <div class="card-body">
                        <form name="my-form" method="post" action="${requestcontext.contextPath}/teacher">
                            <div class="form-group row">
                                <label for="firstName" class="col-md-4 col-form-label text-md-right">Имя</label>
                                <div class="col-md-6">
                                    <input type="text" id="firstName" class="form-control" name="firstName">
                                </div>
                            </div>

                            <div class="form-group row">
                                <label for="lastName" class="col-md-4 col-form-label text-md-right">Фамилия</label>
                                <div class="col-md-6">
                                    <input type="text" id="lastName" class="form-control" name="lastName">
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="exampleFormControlSelect1">Выбор кафедры</label>
                                <select onchange="getSpecialities()" name="departmentUUID" class="form-control" id="exampleFormControlSelect1">
                                    <#list departments as d>
                                        <option value="${d.getId()}">${d.getName()}</option>
                                    </#list>
                                </select>
                            </div>

                            <div class="form-group">
                                <label for="exampleFormControlSelect1">Выбор предметов</label>
                                <select multiple class="form-control" name="subjectQuality" id="subjects">

                                </select>
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
        function getSpecialities() {
            var selectBox = document.getElementById("exampleFormControlSelect1");
            var selectedValue = selectBox.options[selectBox.selectedIndex].value;
            $.ajax({
                type: "GET",
                url: "http://localhost:8080/timetable/subject/" + selectedValue,
                dataType: 'json',
            })
                .done(function (data) {
                    let subjects = "";
                    for (let i = 0; i < data.length; i++) {
                        var subject = data[i]['name'] + "," + data[i]['numberOfHours'];
                        subjects += "<option value=" + subject + ">" + data[i]['name'] + "</option>";
                    }
                    $('#subjects').html(subjects);
                })
                .fail(function (err) {
                    alert("error" + err);
                })
        }
    </script>
</@c.page>