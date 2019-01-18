<#-- create the macro variable: -->
<#macro filters>

    <div class="card">
        <div class="card-body">
            <div class="row">
                <div class="col-md-3-24"> <strong>Your are here:</strong> </div> <!-- col.// -->
                    <nav class="col-md-18-24"> 
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="#">Home</a></li>
                            <li class="breadcrumb-item"><a href="#">Category name</a></li>
                            <li class="breadcrumb-item"><a href="#">Sub category</a></li>
                            <li class="breadcrumb-item active" aria-current="page">Items</li>
                        </ol>  
                    </nav> <!-- col.// -->
                    <div class="col-md-3-24 text-right"> 
                        <a href="#" data-toggle="tooltip" title="List view"> <i class="fa fa-bars"></i></a>
                        <a href="#" data-toggle="tooltip" title="Grid view"> <i class="fa fa-th"></i></a>
                    </div> <!-- col.// -->
                </div> <!-- row.// -->
                <hr>
            <div class="row">
                <div class="col-md-3-24"> <strong>Filter by:</strong> </div> <!-- col.// -->
                <div class="col-md-21-24"> 
                    <ul class="list-inline">
                        <li class="list-inline-item dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">   Supplier type </a>
                            <div class="dropdown-menu p-3" style="max-width:400px;"">	
                                <label class="form-check">
                                    <a href="#">
                                        <input type="checkbox" class="form-check-input"> Good supplier
                                    </a>
                                </label>
                                <label class="form-check">
                                    <a href="#">
                                        <input type="checkbox" class="form-check-input"> Best supplier
                                    </a>
                                </label>
                                <label class="form-check">
                                    <a href="#">
                                        <input type="checkbox" class="form-check-input"> New supplier
                                    </a>
                                </label>
                            </div> <!-- dropdown-menu.// -->
                        </li>
                        <li class="list-inline-item dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">  Country </a>
                            <div class="dropdown-menu p-3" style="max-width:400px;">	
                                <label class="form-check">
                                    <a href="#">
                                        <input type="checkbox" class="form-check-input"> China
                                    </a>
                                </label>
                                <label class="form-check">
                                    <a href="#">
                                        <input type="checkbox" class="form-check-input"> Japan
                                    </a>
                                </label>
                                <label class="form-check">
                                    <a href="#">
                                        <input type="checkbox" class="form-check-input"> Uzbekistan
                                    </a>
                                </label>
                                <label class="form-check">
                                    <a href="#">
                                        <input type="checkbox" class="form-check-input"> Russia
                                    </a>
                                </label>
                            </div> <!-- dropdown-menu.// -->
                        </li>
                        <li class="list-inline-item"><a href="#">Product type</a></li>
                        <li class="list-inline-item"><a href="#">Brand name</a></li>
                        <li class="list-inline-item"><a href="#">Color</a></li>
                        <li class="list-inline-item"><a href="#">Size</a></li>
                        <li class="list-inline-item">
                            <div class="form-inline">
                                <label class="mr-2">Price</label>
                                <input class="form-control form-control-sm" placeholder="Min" type="number">
                                <span class="px-2"> - </span>
                                <input class="form-control form-control-sm" placeholder="Max" type="number">
                                <button type="submit" class="btn btn-sm ml-2">Ok</button>
                            </div>
                        </li>
                    </ul>
                </div> <!-- col.// -->
            </div> <!-- row.// -->
        </div> <!-- card-body .// -->
    </div> <!-- card.// -->
  
</#macro>