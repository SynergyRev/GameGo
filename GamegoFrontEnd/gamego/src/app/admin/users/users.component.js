"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
exports.__esModule = true;
exports.UsersComponent = void 0;
var core_1 = require("@angular/core");
var User_1 = require("../../model/User");
var UsersComponent = /** @class */ (function () {
    function UsersComponent(httpClientService, router, activatedRoute) {
        this.httpClientService = httpClientService;
        this.router = router;
        this.activatedRoute = activatedRoute;
    }
    UsersComponent.prototype.ngOnInit = function () {
        this.refreshData();
    };
    UsersComponent.prototype.refreshData = function () {
        var _this = this;
        this.httpClientService.getUsers().subscribe(function (response) { return _this.handleSuccessfulResponse(response); });
        this.activatedRoute.queryParams.subscribe(function (params) {
            _this.action = params['action'];
            var selectedUserId = params['id'];
            if (selectedUserId) {
            }
        });
    };
    UsersComponent.prototype.viewUser = function (id) {
        this.router.navigate(['admin', 'users'], { queryParams: { id: id, action: 'view' } });
    };
    UsersComponent.prototype.handleSuccessfulResponse = function (response) {
        this.users = response;
        console.log(this.users);
    };
    UsersComponent.prototype.addUser = function () {
        this.selectedUser = new User_1.User();
        this.router.navigate(['admin', 'users'], { queryParams: { action: 'add' } });
    };
    UsersComponent = __decorate([
        (0, core_1.Component)({
            selector: 'app-users',
            templateUrl: './users.component.html',
            styleUrls: ['./users.component.css']
        })
    ], UsersComponent);
    return UsersComponent;
}());
exports.UsersComponent = UsersComponent;
