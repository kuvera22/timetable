<#import "parts/common.ftl" as c>

<@c.page>
    <section id="FirstScreenMenu">
        <div class="darkTheme"></div>
        <div class="container">
            <div class="row">
                <div class="wrapper col-12">
                    <section id="Coffee">
                        <div class="container-fluid">
                            <div class="row">
                                <div class="col-12">
                                    <div class="sectionHeader text-center">
                                        <h2>Работа с исходными данными</h2>
                                    </div>
                                </div>
                                <div class="col-sm-6 col-md-4">
                                    <div class="menuPoint">
                                        <div class="menuPointPhoto"><img src="static/images/8.jpg" alt=""></div>
                                        <div class="menuPointInfo">
                                            <h4>Преподаватели</h4>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-6 col-md-4">
                                    <div class="menuPoint">
                                        <div class="menuPointPhoto"><img src="static/images/9.png" alt=""></div>
                                        <div class="menuPointInfo">
                                            <h4>Кафедра</h4>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-6 col-md-4">
                                    <div class="menuPoint">
                                        <div class="menuPointPhoto"><img src="static/images/10.jpg" alt=""></div>
                                        <div class="menuPointInfo">
                                            <h4>Группа</h4>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-6 col-md-4">
                                    <div class="menuPoint">
                                        <div class="menuPointPhoto"><img src="static/images/11.png" alt=""></div>
                                        <div class="menuPointInfo">
                                            <h4>Аудитория</h4>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-6 col-md-4">
                                    <div class="menuPoint">
                                        <div class="menuPointPhoto"><img src="static/images/13.jpg" alt=""></div>
                                        <div class="menuPointInfo">
                                            <h4>Время пар</h4>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-sm-6 col-md-4">
                                    <div class="menuPoint">
                                        <div class="menuPointPhoto"><img src="static/images/14.jpg" alt=""></div>
                                        <div class="menuPointInfo">
                                            <h4>Специальность</h4>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </section>
                </div>
            </div>
        </div>
    </section>
</@c.page>

<style>
    section {
        padding: 50px 0;
    }

    h2 {
        color: black;
    }

    .sectionHeader {
        margin-bottom: 50px;
    }

    .sectionHeader p{
        margin: 20px auto 20px auto;

    }

    #FirstScreenMenu {
        background-size: cover;
        padding-bottom: 0;
        padding-top: 0;
    }

    ul {
        position: relative;
        list-style: none;
    }

    li {
        display: inline-block;
        margin: 10px;
        transition: all 1s ease;
    }

    a {
        display: block;
        border: 3px solid;
        padding: 0 40px;
        letter-spacing: 1.5px;
        font-size: 1.2em;
        line-height: 2.4em;
        font-weight: 600;
        color: #fff;
        border: none;
    }

    h4 {
        text-align: center;
    }

    #FirstScreenMenu img {
        display: block;
        width: 100%;
        border-top-right-radius: 7px;
        border-top-left-radius: 7px;
    }

</style>
